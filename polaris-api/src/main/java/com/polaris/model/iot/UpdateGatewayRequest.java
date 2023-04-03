package com.polaris.model.iot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UpdateGatewayRequest {
  private Long id;
  private String name;
  @JsonProperty("gateway_key")
  private String gatewayKey;
  private String describes;
}
