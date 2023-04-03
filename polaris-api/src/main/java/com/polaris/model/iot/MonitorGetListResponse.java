package com.polaris.model.iot;

import java.util.List;

public class MonitorGetListResponse {
    private Integer size;
    private Long total;

    private List<MonitorItemResp> list;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<MonitorItemResp> getList() {
        return list;
    }

    public void setList(List<MonitorItemResp> list) {
        this.list = list;
    }
}
