package com.polaris.serve.controller.iot;

import com.polaris.api.iot.IotGatewayApi;
import com.polaris.model.iot.CreateGatewayRequest;
import com.polaris.model.iot.GatewayListRequest;
import com.polaris.model.iot.UpdateGatewayRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.serve.service.IotGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: polaris
 */
@RestController("IOTGatewayController")
public class IotGatewayController implements IotGatewayApi {
    @Autowired
    private IotGatewayService gatewayService;

    @Override
    public ResponseEntity<Object> iotApiGatewayPost(String authorization, CreateGatewayRequest request) {
        return new ResponseEntity<>(gatewayService.createIotGateway(request), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> iotApiGatewayListGet(String authorization, Long projectId, GatewayListRequest request) {
        return new ResponseEntity<>(gatewayService.getGatewayIdByProject(projectId, request), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> iotApiGatewayCount(String authorization, Long projectId) {
        return new ResponseEntity<>(gatewayService.getIotGatewayCount(projectId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RespBean> iotApiGatewayGet(String authorization, Long gatewayId) {
        return new ResponseEntity<>(gatewayService.getGatewayDetail(gatewayId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> iotApiGatewayUpdate(String authorization, Long gatewayId,
            UpdateGatewayRequest request) {
        return gatewayService.UpdateGateway(gatewayId, request);
    }

    @Override
    public ResponseEntity<Object> iotApiGatewayDelete(String authorization, Long gatewayId) {
        return gatewayService.deleteGateway(gatewayId);
    }

    
}
