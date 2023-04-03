package com.polaris.model.iot;


import lombok.Data;

import java.util.Date;

@Data
public class TaskResponseBean {
    private Long id;
    private String name;

    private Integer type;

    private Integer clockType;

    private Integer time;

    private Integer status;

    private Date createTime;

    private Long gatewayId;

    private String taskJson;
}
