package com.polaris.model.iot;

import lombok.Data;

@Data
public class GatewayListRequest {
    private Integer page;
    private Integer limit;

    private Long gatewayId;

    private String gatewayName;
}
