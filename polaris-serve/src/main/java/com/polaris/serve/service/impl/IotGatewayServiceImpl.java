package com.polaris.serve.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.polaris.model.iot.CreateGatewayRequest;
import com.polaris.model.iot.UpdateGatewayRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.common.enums.StatusTypeEnum;
import com.polaris.mbg.entity.IotGateway;
import com.polaris.serve.service.IotGatewayService;
import com.polaris.mbg.mapper.IotGatewayMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

/**
* @author tian
* @description 针对表【iot_gateway】的数据库操作Service实现
* @createDate 2023-04-02 13:59:08
*/
@Service
public class IotGatewayServiceImpl extends ServiceImpl<IotGatewayMapper, IotGateway>
implements IotGatewayService{
    @Resource
    private IotGatewayMapper gatewayMapper;

    @Override
    public RespBean createIotGateway(CreateGatewayRequest request) {
        IotGateway gateway = new IotGateway();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        gateway.setGatewayKey(uuid);

        gateway.setName(request.getName());
        gateway.setProjectId(request.getProjectId());
        gateway.setStatus(StatusTypeEnum.YES.getCode());
        long time = System.currentTimeMillis();
        gateway.setCreateTime(new Timestamp(time));
        gateway.setDescribes(request.getDescribes());
        save(gateway);
        return RespBean.success("创建网关设备成功", gateway);
    }

    @Override
    public RespBean getIotGatewayCount(Long projectId) {
        QueryWrapper<IotGateway> queryWrapper = new QueryWrapper<IotGateway>().eq("project_id", projectId);
        Long count = gatewayMapper.selectCount(queryWrapper);
        return RespBean.success(count);
    }

    @Override
    public RespBean getGatewayIdByProject(Long projectId) {
        QueryWrapper<IotGateway> queryWrapper = new QueryWrapper<IotGateway>().eq("project_id", projectId);
        List<IotGateway> iotGateways = gatewayMapper.selectList(queryWrapper);
        return RespBean.success(iotGateways);
    }

    @Override
    public RespBean getGatewayDetail(Long gatewayId) {
        QueryWrapper<IotGateway> queryWrapper = new QueryWrapper<IotGateway>().eq("id", gatewayId);
        IotGateway iotGateway = gatewayMapper.selectOne(queryWrapper);
        return RespBean.success(iotGateway);
    }

    @Override
    public ResponseEntity<Object> UpdateGateway(Long gatewayId, UpdateGatewayRequest request) {

        try{
            QueryWrapper<IotGateway> queryWrapper = new QueryWrapper<IotGateway>().eq("id", gatewayId);
            IotGateway gateway = gatewayMapper.selectOne(queryWrapper);
            gateway.setName(request.getName());
            gateway.setGatewayKey(request.getGatewayKey());
            gateway.setDescribes(request.getDescribes());
            updateById(gateway);
            return new ResponseEntity<>(RespBean.success("更新成功"), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(RespBean.error("数据不存在,更新失败", null), HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<Object> deleteGateway(Long gatewayId) {
        try{
            removeById(gatewayId);
            return new ResponseEntity<>(RespBean.success("网关删除成功", gatewayId), HttpStatus.OK);

        } catch (Exception e){
            return new ResponseEntity<>(RespBean.error("网关数据删除失败", null), HttpStatus.OK);
        }
    }

}
