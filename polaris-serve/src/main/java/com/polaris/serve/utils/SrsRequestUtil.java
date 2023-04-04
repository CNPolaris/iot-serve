package com.polaris.serve.utils;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.polaris.common.utils.Commons;
import com.polaris.model.srs.SrsInfoData;
import com.polaris.model.srs.SrsMeminfosRecv;
import com.polaris.model.srs.SrsSummariesResponse;

public class SrsRequestUtil {

    public static SrsSummariesResponse getSrsSummariesV1() {
        String result = HttpUtil.get(Commons.SRS_ADDRESS + Commons.SRS_SUMMARIES);
        SrsSummariesResponse response = JSONUtil.toBean(result, SrsSummariesResponse.class);
        return response;
    }

    public static SrsMeminfosRecv getMeminfosV1() {
        String result = HttpUtil.get(Commons.SRS_ADDRESS + Commons.SRS_MEMINFOS);
        SrsMeminfosRecv srsMeminfosRecv = JSONUtil.toBean(result, SrsMeminfosRecv.class);
        return srsMeminfosRecv;
    }
}
