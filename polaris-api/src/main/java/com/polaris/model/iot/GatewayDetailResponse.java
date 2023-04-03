package com.polaris.model.iot;

import lombok.Data;

import java.util.Date;

@Data
public class GatewayDetailResponse {
    private Long id;

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
}
