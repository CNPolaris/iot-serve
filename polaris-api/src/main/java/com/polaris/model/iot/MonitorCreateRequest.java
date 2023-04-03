package com.polaris.model.iot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MonitorCreateRequest {
    @JsonProperty("name")
    private String name;
    @JsonProperty("projectId")
    private Long projectId;
    @JsonProperty("describes")
    private String describes;

    private Long createUser;
}
