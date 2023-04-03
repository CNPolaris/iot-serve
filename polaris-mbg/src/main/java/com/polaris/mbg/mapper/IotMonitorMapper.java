package com.polaris.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.polaris.model.iot.MonitorGetResponse;
import com.polaris.mbg.entity.IotMonitor;


/**
* @author tian
* @description 针对表【iot_monitor】的数据库操作Mapper
* @createDate 2023-04-02 14:00:23
* @Entity com.polaris.mbg.entity.IotMonitor
*/
public interface IotMonitorMapper extends BaseMapper<IotMonitor> {
    MonitorGetResponse getMonitorDetail(Long monitorId);


}
