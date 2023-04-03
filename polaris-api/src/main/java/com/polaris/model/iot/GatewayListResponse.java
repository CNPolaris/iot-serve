package com.polaris.model.iot;

import lombok.Data;

import java.util.List;

@Data
public class GatewayListResponse {
    private Integer size;
    private Long total;

    private List<GatewayDetailResponse> list;
}
