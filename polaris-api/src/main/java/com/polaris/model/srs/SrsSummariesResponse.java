package com.polaris.model.srs;

import lombok.Data;

@Data
public class SrsSummariesResponse {
    private Integer code;
    private String server;

    private SrsInfoData data;
}
