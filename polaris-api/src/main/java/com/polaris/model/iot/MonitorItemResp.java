package com.polaris.model.iot;

public class MonitorItemResp {
    private String id;
    private String name;

    private String createTime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public MonitorItemResp(String id, String name, String createTime, Integer status) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.status = status;
    }
}
