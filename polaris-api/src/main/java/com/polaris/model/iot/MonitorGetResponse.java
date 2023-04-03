package com.polaris.model.iot;

import lombok.Data;

@Data
public class MonitorGetResponse {
    private String Id;
    private String name;
    private String createTime;
    private Integer status;
    private String describes;

    private String projectId;

    private String monitorKey;

    private String projectName;
}
