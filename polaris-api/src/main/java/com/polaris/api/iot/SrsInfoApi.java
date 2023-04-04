package com.polaris.api.iot;

import com.polaris.common.dto.RespBean;
import com.polaris.model.srs.SrsMeminfosRecv;
import com.polaris.model.srs.SrsSummariesResponse;
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

public interface SrsInfoApi {
    /**
     * GET /iot/v1/api/srs/summaries : 获取服务器的摘要信息
     *
     * @param authorization  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "获取服务器的摘要信息", nickname = "srsSummariesV1", notes = "", response = SrsSummariesResponse.class, tags={ "IOT", "Address"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = SrsSummariesResponse.class) })
    @RequestMapping(value = "/iot/v1/api/srs/summaries",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<SrsSummariesResponse> srsSummariesV1(@RequestHeader(value="Authorization", required=true) String authorization) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /iot/v1/api/srs/meminfos : 获取服务器内存使用情况
     *
     * @param authorization  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "获取服务器的摘要信息", nickname = "srsSummariesV1", notes = "", response = SrsSummariesResponse.class, tags={ "IOT", "Address"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = SrsSummariesResponse.class) })
    @RequestMapping(value = "/iot/v1/api/srs/meminfos",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<SrsMeminfosRecv> srsMeminfosV1(@RequestHeader(value="Authorization", required=true) String authorization) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
