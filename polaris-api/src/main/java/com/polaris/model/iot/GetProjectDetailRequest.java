package com.polaris.model.iot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author: polaris
 */
@Data
public class GetProjectDetailRequest {
    @JsonProperty("project_id")
    private Long projectId;
}
