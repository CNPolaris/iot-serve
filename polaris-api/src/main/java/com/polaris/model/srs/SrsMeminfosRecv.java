package com.polaris.model.srs;

import lombok.Data;

@Data
public class SrsMeminfosRecv {
    private Integer code;
    private String server;
    private MeminfosResponse data;
}
