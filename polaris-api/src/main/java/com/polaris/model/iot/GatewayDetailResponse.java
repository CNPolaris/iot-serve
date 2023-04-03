package com.polaris.model.iot;

import lombok.Data;

import java.util.Date;

@Data
public class GatewayDetailResponse {
    private String id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String gatewayKey;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Integer status;

    /**
     *
     */
    private Long projectId;

    /**
     *
     */
    private String describes;

    private String address;

    public GatewayDetailResponse() {
    }

    public GatewayDetailResponse(String id, String name, String gatewayKey, Date createTime, Integer status, Long projectId, String describes, String address) {
        this.id = id;
        this.name = name;
        this.gatewayKey = gatewayKey;
        this.createTime = createTime;
        this.status = status;
        this.projectId = projectId;
        this.describes = describes;
        this.address = address;
    }
}
