package com.polaris.model.iot;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Objects;


/**
 * CreateProjectRequest
 */
@Data
public class CreateProjectRequest   {
  @JsonProperty("name")
  private String name;

  private Integer serverId;
}

