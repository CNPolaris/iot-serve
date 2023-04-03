package com.polaris.model.iot;

import lombok.Data;

/**
 * @author: polaris
 */
@Data
public class GetMyProjectResponse {
    private String id;
    private String name;
    private String projectKey;
    private String createTime;
    private Integer userCount;
    private Integer status;
    private Integer gatewayCount;
}
