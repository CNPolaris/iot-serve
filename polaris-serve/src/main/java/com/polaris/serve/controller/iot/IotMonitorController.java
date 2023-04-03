package com.polaris.serve.controller.iot;

import com.polaris.api.iot.IotMonitorApi;
import com.polaris.model.iot.MonitorCreateRequest;
import com.polaris.model.iot.MonitorGetListRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.model.iot.MonitorUpdateRequest;
import com.polaris.security.util.JwtTokenUtil;
import com.polaris.serve.service.IotMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController("IOTMonitorController")
public class IotMonitorController implements IotMonitorApi {
    @Autowired
    private IotMonitorService monitorService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public ResponseEntity<RespBean> iotApiMonitorCreate(String authorization, MonitorCreateRequest request) {
        Long userId = jwtTokenUtil.getUserId(authorization);
        request.setCreateUser(userId);
        return monitorService.createMonitor(request);
    }

    @Override
    public ResponseEntity<RespBean> iotApiMonitorDelete(String authorization, Long monitorId) {
        return monitorService.deleteMonitor(monitorId);
    }

    @Override
    public ResponseEntity<Object> iotApiMonitorGet(String authorization, Long monitorId) {
        return monitorService.getMonitor(monitorId);
    }

    @Override
    public ResponseEntity<Object> iotApiMonitorList(String authorization, MonitorGetListRequest request) {
        return monitorService.getMonitorList(request);
    }

    /**
     * POST /iot/api/monitor : 更新监控
     *
     * @param authorization (optional)
     * @param monitorId
     * @param request       (optional)
     * @return 成功 (status code 200)
     */
    @Override
    public ResponseEntity<RespBean> iotApiMonitorUpdate(String authorization, Long monitorId, MonitorUpdateRequest request) {
        return monitorService.updateMonitor(monitorId, request);
    }
}
