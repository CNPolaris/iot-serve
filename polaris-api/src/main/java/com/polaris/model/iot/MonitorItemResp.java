package com.polaris.model.iot;

import lombok.Data;

import java.util.Date;

@Data
public class MonitorItemResp {
    private String id;
    private String name;

    private Date createTime;

    private Integer status;

    private Integer onLine;
    private String monitorKey;
    private String describes;

    public MonitorItemResp(String id, String name, Date createTime, Integer status, Integer onLine) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.status = status;
        this.onLine = onLine;
    }

    public MonitorItemResp(String id, String name, Date createTime, Integer status, Integer onLine, String monitorKey, String describes) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.status = status;
        this.onLine = onLine;
        this.monitorKey = monitorKey;
        this.describes = describes;
    }
}
