package com.polaris.model.srs;

import lombok.Data;

@Data
public class SrsSelfInfo {
    private String version;
    private Integer pid;
    private Integer ppid;
    private String argv;

    private String cwd;
    private Integer mem_kbyte;
    private Double mem_percent;

    private Double cpu_percent;
    private Integer srs_uptime;
}
