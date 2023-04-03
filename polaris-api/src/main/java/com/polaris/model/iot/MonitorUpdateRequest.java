package com.polaris.model.iot;

import lombok.Data;

@Data
public class MonitorUpdateRequest {
    private Long id;
    private String name;
    private String describes;
    private Integer Status;

}
