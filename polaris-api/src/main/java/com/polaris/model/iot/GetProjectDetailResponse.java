package com.polaris.model.iot;

import lombok.Data;

/**
 * @author: polaris
 */
@Data
public class GetProjectDetailResponse {
    private Long id;
    private String name;
    private String createUser;
    private Integer userCount;
    private String createTime;
    private Integer status;

    private String describes;

    private String serverName;
}
