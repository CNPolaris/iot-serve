package com.polaris.model.iot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AuthSrsStreamRequest {
    @JsonProperty("server_id")
    private String server_id;
    @JsonProperty("action")

    private String action;
    @JsonProperty("client_id")
    private String client_id;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("vhost")
    private String vhost;
    @JsonProperty("app")
    private String app;
    @JsonProperty("tcUrl")
    private String tcUrl;
    @JsonProperty("stream")
    private String stream;
    @JsonProperty("param")
    private String param;

}
