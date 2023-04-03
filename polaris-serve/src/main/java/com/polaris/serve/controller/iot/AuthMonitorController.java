package com.polaris.serve.controller.iot;

import com.polaris.api.iot.AuthMonitorApi;
import com.polaris.model.iot.AuthMonitorResponse;
import com.polaris.model.iot.AuthSrsStreamRequest;
import com.polaris.serve.service.IotMonitorService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class AuthMonitorController implements AuthMonitorApi {
    @Autowired
    private IotMonitorService monitorService;

    @Override
    public ResponseEntity<AuthMonitorResponse> iotMonitorSrsPublish(@RequestBody AuthSrsStreamRequest request) {
        AuthMonitorResponse response = new AuthMonitorResponse(monitorService.authSrsPublish(request));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * /iot/v1/srs/stream/unpublish : 验证推流
     *
     * @param request (optional)
     * @return 成功 (status code 200)
     */
    @Override
    public ResponseEntity<AuthMonitorResponse> iotMonitorSrsUnPublish(AuthSrsStreamRequest request) {
        AuthMonitorResponse response = new AuthMonitorResponse(monitorService.authSrsUnPublish(request));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
