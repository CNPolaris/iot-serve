package com.polaris.model.user.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;


/**
 * SysUserResponse
 */
@Data
public class SysUserResponse   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("role")
  private Integer role;

  @JsonProperty("createTime")
  private Date createTime;

  @JsonProperty("updateTime")
  private Date updateTime;

  @JsonProperty("status")
  private Integer status;

}

