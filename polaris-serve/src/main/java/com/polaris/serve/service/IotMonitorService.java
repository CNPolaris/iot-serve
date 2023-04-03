package com.polaris.serve.service;

import com.polaris.model.iot.AuthSrsStreamRequest;
import com.polaris.model.iot.MonitorCreateRequest;
import com.polaris.model.iot.MonitorGetListRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.mbg.entity.IotMonitor;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.http.ResponseEntity;

/**
* @author tian
* @description 针对表【iot_monitor】的数据库操作Service
* @createDate 2023-04-02 14:00:23
*/
public interface IotMonitorService extends IService<IotMonitor> {
    Integer authSrsPublish(AuthSrsStreamRequest request);
    ResponseEntity<RespBean> createMonitor(MonitorCreateRequest request);

    ResponseEntity<RespBean> deleteMonitor(Long monitorId);

    ResponseEntity<Object> getMonitor(Long monitorId);

    ResponseEntity<Object> getMonitorList(MonitorGetListRequest request);

}
