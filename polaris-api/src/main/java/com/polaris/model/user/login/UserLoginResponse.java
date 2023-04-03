package com.polaris.model.user.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


/**
 * UserLoginResponse
 */
@Data
public class UserLoginResponse   {
  @JsonProperty("header")
  private String header;

  @JsonProperty("token")
  private String token;

  @JsonProperty("user_info")
  private SysUserResponse userInfo;
}

