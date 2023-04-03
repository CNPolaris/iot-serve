package com.polaris.api.iot;

import com.polaris.common.dto.RespBean;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

public interface SysServeApi {
    /**
     * GET /iot/api/serve/address : 服务器列表
     *
     * @param authorization  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "服务器列表", nickname = "iotServerAddressList", notes = "", response = RespBean.class, tags={ "IOT", "Address"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = RespBean.class) })
    @RequestMapping(value = "/iot/api/serve/address",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<RespBean> iotServerAddressList(Principal principal, @ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
