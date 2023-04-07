package com.polaris.api.iot;

import com.polaris.model.iot.*;
import com.polaris.common.dto.RespBean;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface IotMonitorApi {

    /**
     * POST /iot/api/monitor : 添加监控
     *
     * @param authorization  (optional)
     * @param request  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "添加监控", nickname = "iotApiMonitorCreate", notes = "", response = Object.class, tags={ "IOT", "Monitor"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = Object.class) })
    @RequestMapping(value = "/iot/api/monitor",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    default ResponseEntity<RespBean> iotApiMonitorCreate(@ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                         @ApiParam(value = ""  ) @RequestBody(required = true) MonitorCreateRequest request) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    /**
     * POST /iot/api/monitor : 更新监控
     *
     * @param authorization  (optional)
     * @param request  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "更新监控", nickname = "iotApiMonitorUpdate", notes = "", response = Object.class, tags={ "IOT", "Monitor"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = Object.class) })
    @RequestMapping(value = "/iot/api/monitor/{monitorId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    default ResponseEntity<RespBean> iotApiMonitorUpdate(@ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                         @PathVariable Long monitorId,
                                                         @ApiParam(value = ""  ) @RequestBody(required = true) MonitorUpdateRequest request) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    /**
     * DELETE /iot/api/monitor : 删除监控
     *
     * @param authorization  (optional)
     * @param monitorId  Long
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "删除监控", nickname = "iotApiMonitorDelete", notes = "", response = Object.class, tags={ "IOT", "Monitor"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = RespBean.class) })
    @RequestMapping(value = "/iot/api/monitor/{monitorId}",
            method = RequestMethod.DELETE)
    default ResponseEntity<RespBean> iotApiMonitorDelete(@ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                     @PathVariable(required = true) Long monitorId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /iot/api/monitor/{monitorId} : 获取监控详情
     *
     * @param authorization  (optional)
     * @param monitorId  Long
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "获取监控详情", nickname = "iotApiMonitorGet", notes = "", response = Object.class, tags={ "IOT", "Monitor"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = Object.class) })
    @RequestMapping(value = "/iot/api/monitor/{monitorId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<Object> iotApiMonitorGet(@ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                     @PathVariable(required = true)  Long monitorId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    /**
     * GET /iot/api/monitor : 获取项目关联的监控列表
     *
     * @param authorization  (optional)
     * @param request  MonitorGetListRequest
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "获取项目关联的监控列表", nickname = "iotApiMonitorList", notes = "", response = Object.class, tags={ "IOT", "Monitor"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = Object.class) })
    @RequestMapping(value = "/iot/api/monitor/list",
            produces = { "application/json" },
            method = RequestMethod.POST)
    default ResponseEntity<Object> iotApiMonitorList(
            @CookieValue(value = "cur_region", defaultValue = "") Integer cur_region,
            @ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
            @RequestBody MonitorGetListRequest request) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
