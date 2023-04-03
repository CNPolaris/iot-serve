package com.polaris.serve.service;

import com.polaris.model.iot.CreateGatewayRequest;
import com.polaris.model.iot.UpdateGatewayRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.mbg.entity.IotGateway;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.http.ResponseEntity;

/**
* @author tian
* @description 针对表【iot_gateway】的数据库操作Service
* @createDate 2023-04-02 13:59:08
*/
public interface IotGatewayService extends IService<IotGateway> {
    RespBean createIotGateway(CreateGatewayRequest request);

    RespBean getIotGatewayCount(Long projectId);

    RespBean getGatewayIdByProject(Long projectId);

    RespBean getGatewayDetail(Long gatewayId);

    ResponseEntity<Object> UpdateGateway(Long gatewayId, UpdateGatewayRequest request);

    ResponseEntity<Object> deleteGateway(Long gatewayId);

}
