package com.polaris.model.iot;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * CreateGatewayRequest
 */

public class CreateGatewayRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("project_id")
  private Long projectId;

  private String describes;

  public String getDescribes() {
    return describes;
  }

  public void setDescribes(String describes) {
    this.describes = describes;
  }

  public CreateGatewayRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 网关名
   * @return name
  */
  @ApiModelProperty(required = true, value = "网关名")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateGatewayRequest projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * 项目id
   * @return projectId
  */
  @ApiModelProperty(required = true, value = "项目id")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGatewayRequest createGatewayRequest = (CreateGatewayRequest) o;
    return Objects.equals(this.name, createGatewayRequest.name) &&
        Objects.equals(this.projectId, createGatewayRequest.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGatewayRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

