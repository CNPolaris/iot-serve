package com.polaris.model.iot;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * CreateProjectRequest
 */
public class CreateProjectRequest   {
  @JsonProperty("name")
  private String name;

  public CreateProjectRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 项目名
   * @return name
  */
  @ApiModelProperty(required = true, value = "项目名")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectRequest createProjectRequest = (CreateProjectRequest) o;
    return Objects.equals(this.name, createProjectRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

