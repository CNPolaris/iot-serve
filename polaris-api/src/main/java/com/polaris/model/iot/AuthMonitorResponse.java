package com.polaris.model.iot;

import lombok.Data;

@Data
public class AuthMonitorResponse {
    private Integer code;

    public AuthMonitorResponse(Integer code) {
        this.code = code;
    }

    public static AuthMonitorResponse success() {
        return new AuthMonitorResponse(0);
    }
    public static AuthMonitorResponse error() {
        return new AuthMonitorResponse(1);
    }
}
