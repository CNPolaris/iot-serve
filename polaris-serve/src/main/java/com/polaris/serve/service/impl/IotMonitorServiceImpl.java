package com.polaris.serve.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.polaris.model.iot.*;
import com.polaris.common.dto.RespBean;
import com.polaris.common.enums.StatusTypeEnum;
import com.polaris.common.utils.Commons;
import com.polaris.mbg.entity.IotMonitor;
import com.polaris.serve.service.IotMonitorService;
import com.polaris.mbg.mapper.IotMonitorMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
* @author tian
* @description 针对表【iot_monitor】的数据库操作Service实现
* @createDate 2023-04-02 14:00:23
*/
@Service
public class IotMonitorServiceImpl extends ServiceImpl<IotMonitorMapper, IotMonitor>
implements IotMonitorService{
    @Resource
    private IotMonitorMapper monitorMapper;

    @Override
    public Integer authSrsPublish(AuthSrsStreamRequest request) {
        try {
            if (request.getServer_id() == null) {
                return 1;
            }
            IotMonitor monitor = monitorMapper.selectOne(new QueryWrapper<IotMonitor>().eq("monitor_key", request.getStream()));
            if (monitor != null && monitor.getStatus().equals(Commons.YES)) {
                monitor.setOnLine(StatusTypeEnum.YES.getCode());
                updateById(monitor);
                return 0;
            }
            return 1;
        } catch (Exception e) {
            return 1;
        }
    }

    @Override
    public Integer authSrsUnPublish(AuthSrsStreamRequest request) {
         try {
            if (request.getServer_id() == null) {
                return 1;
            }
            IotMonitor monitor = monitorMapper.selectOne(new QueryWrapper<IotMonitor>().eq("monitor_key", request.getStream()));
            if (monitor != null && monitor.getStatus().equals(Commons.YES)) {
                monitor.setOnLine(StatusTypeEnum.NO.getCode());
                updateById(monitor);
                return 0;
            }
            return 1;
        } catch (Exception e) {
            return 1;
        }
    }

    @Override
    public ResponseEntity<RespBean> createMonitor(MonitorCreateRequest request) {
        try{
            IotMonitor iotMonitor = new IotMonitor();
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            iotMonitor.setMonitorKey(uuid);
            iotMonitor.setName(request.getName());
            iotMonitor.setDescribes(request.getDescribes());
            iotMonitor.setCreateUser(request.getCreateUser());
            iotMonitor.setStatus(StatusTypeEnum.YES.getCode());
            iotMonitor.setOnLine(StatusTypeEnum.NO.getCode());
            iotMonitor.setProjectId(request.getProjectId());
            long time = System.currentTimeMillis();
            iotMonitor.setCreateTime(new Timestamp(time));
            save(iotMonitor);
            return new ResponseEntity<>(RespBean.success("创建监控设备成功", iotMonitor), HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>(RespBean.error(e.getMessage()), HttpStatus.ACCEPTED);
        }
    }

    @Override
    public ResponseEntity<RespBean> deleteMonitor(Long monitorId) {
        try {
         removeById(monitorId);
         return new ResponseEntity<>(RespBean.success("删除成功"), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(RespBean.error(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Object> getMonitor(Long monitorId) {
        MonitorGetResponse monitorDetail = monitorMapper.getMonitorDetail(monitorId);
        if(monitorDetail != null) {
            return new ResponseEntity<>(RespBean.success(monitorDetail), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(RespBean.error("查询结果为空"), HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Object> getMonitorList(MonitorGetListRequest request) {
        Page<IotMonitor> objectPage = new Page<>(request.getPage(), request.getLimit());
        monitorMapper.selectPage(objectPage, new QueryWrapper<IotMonitor>().eq("project_id", request.getProjectId()));
        MonitorGetListResponse response = new MonitorGetListResponse();
        response.setTotal(objectPage.getTotal());
        List<MonitorItemResp> list = new ArrayList<>();
        objectPage.getRecords().forEach(item -> {
            MonitorItemResp itemResp = new MonitorItemResp(item.getId().toString(), item.getName(), item.getCreateTime().toString(), item.getStatus(), item.getOnLine());
            list.add(itemResp);
        });
        response.setSize(list.size());
        response.setList(list);
        return new ResponseEntity<>(RespBean.success(response), HttpStatus.OK);
    }

}
