package com.polaris.model.srs;

import lombok.Data;

@Data
public class MeminfosResponse {
    private boolean ok;
    private Integer sample_time;
    private Double percent_ram;
    private Double percent_swap;
    private Integer MemActive;
    private Integer RealInUse;
    private Integer NotInUse;
    private Integer MemTotal;
    private Integer MemFree;
    private Integer Buffers;
    private Integer Cached;
    private Integer SwapTotal;
    private Integer SwapFree;
}
