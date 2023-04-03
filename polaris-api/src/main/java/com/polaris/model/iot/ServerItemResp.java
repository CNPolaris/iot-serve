package com.polaris.model.iot;

import lombok.Data;

@Data
public class ServerItemResp {
    private Integer id;

    private String name;

    private String address;

    private Integer status;

    public ServerItemResp(Integer id, String name, String address, Integer status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.status = status;
    }
}
