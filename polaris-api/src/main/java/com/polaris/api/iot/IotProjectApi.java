package com.polaris.api.iot;

import com.polaris.model.iot.*;
import com.polaris.common.dto.RespBean;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * @author: polaris
 */
@Api(value = "IOT-Project")
public interface IotProjectApi {

    /**
     * POST /iot/api/project : 创建项目
     *
     * @param authorization  (optional)
     * @param request  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "创建项目", nickname = "iotProjectPost", notes = "", response = RespBean.class, tags={ "IOT", "Project"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = RespBean.class) })
    @RequestMapping(value = "/iot/api/project",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    default ResponseEntity<RespBean> iotProjectPost(Principal principal, @ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                    @ApiParam(value = ""  ) @RequestBody(required = true)CreateProjectRequest request) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /iot/api/project : 我的项目
     *
     * @param authorization  (optional)
     * @param request  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "我的项目", nickname = "iotProjectGet", notes = "", response = RespBean.class, tags={ "IOT", "Project"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = RespBean.class) })
    @RequestMapping(value = "/iot/api/project",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<RespBean> iotProjectGet(Principal principal, @ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                    @ApiParam(value = ""  ) @RequestBody(required = false) GetMyProjectRequest request) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    /**
     * GET /iot/api/project/{gatewayId} : 项目概要
     *
     * @param authorization  (optional)
     * @param projectId  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "项目概要", nickname = "iotProjectGetDetail", notes = "", response = RespBean.class, tags={ "IOT", "Project"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = RespBean.class) })
    @RequestMapping(value = "/iot/api/project/{projectId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<RespBean> iotProjectGetDetail(Principal principal, @ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                    @PathVariable Long projectId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * DELETE /iot/api/project : 删除项目
     *
     * @param authorization  (optional)
     * @param projectId  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "删除项目", nickname = "iotProjectDelete", notes = "", response = RespBean.class, tags={ "IOT", "Project"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = RespBean.class) })
    @RequestMapping(value = "/iot/api/project/{projectId}",
            produces = { "application/json" },
            method = RequestMethod.DELETE)
    default ResponseEntity<RespBean> iotProjectDelete(Principal principal, @ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                    @PathVariable(required = true) Long projectId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /iot/api/dash/{projectId} : 面板概要
     *
     * @param authorization  (optional)
     * @param projectId  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "面板概要", nickname = "iotProjectGetDetail", notes = "", response = RespBean.class, tags={ "IOT", "Dash"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = RespBean.class) })
    @RequestMapping(value = "/iot/api/dash/{projectId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<RespBean> iotDashInfo(Principal principal, @ApiParam(value = "" ) @RequestHeader(value="Authorization", required=true) String authorization,
                                                    @PathVariable Long projectId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
