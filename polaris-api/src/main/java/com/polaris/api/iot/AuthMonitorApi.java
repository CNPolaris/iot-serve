package com.polaris.api.iot;

import com.polaris.common.dto.RespBean;
import com.polaris.model.iot.AuthMonitorResponse;
import com.polaris.model.iot.AuthSrsStreamRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface AuthMonitorApi {
        /**
     * /iot/v1/srs/stream/publish : 验证推流
     *
     * @param request  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "验证推流", nickname = "iotMonitorSrsPublish", notes = "", response = RespBean.class, tags={ "", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = RespBean.class) })
    @RequestMapping(value = "/iot/v1/srs/stream/publish",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    default ResponseEntity<AuthMonitorResponse> iotMonitorSrsPublish(@ApiParam(value = ""  ) @RequestBody(required = true) AuthSrsStreamRequest request) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}
