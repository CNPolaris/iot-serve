package com.polaris.serve.controller.iot;

import com.polaris.api.iot.SrsInfoApi;
import com.polaris.common.dto.RespBean;
import com.polaris.model.srs.SrsMeminfosRecv;
import com.polaris.model.srs.SrsSummariesResponse;
import com.polaris.model.srs.SrsSummariesResponseDTO;
import com.polaris.serve.utils.SrsRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class SrsInfoController implements SrsInfoApi {

    /**
     * GET /iot/v1/api/srs/summaries : 获取服务器的摘要信息
     *
     * @param authorization (optional)
     * @return 成功 (status code 200)
     */
    @Override
    public ResponseEntity<SrsSummariesResponse> srsSummariesV1(String authorization) {
        SrsSummariesResponse summariesV1 = SrsRequestUtil.getSrsSummariesV1();
        if (summariesV1.getCode().equals(0)) {
            summariesV1.setCode(200);
        }
        return new ResponseEntity<>(summariesV1, HttpStatus.OK);
    }

    /**
     * GET /iot/v1/api/srs/meminfos : 获取服务器内存使用情况
     *
     * @param authorization (optional)
     * @return 成功 (status code 200)
     */
    @Override
    public ResponseEntity<SrsMeminfosRecv> srsMeminfosV1(String authorization) {
        SrsMeminfosRecv meminfosRecv = SrsRequestUtil.getMeminfosV1();
        if (meminfosRecv.getCode().equals(0)){
            meminfosRecv.setCode(200);
        }
        return new ResponseEntity<>(meminfosRecv, HttpStatus.OK);
    }
}
