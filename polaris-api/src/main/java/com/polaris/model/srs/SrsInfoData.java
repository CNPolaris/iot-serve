package com.polaris.model.srs;

import lombok.Data;

@Data
public class SrsInfoData {
    private boolean ok;
    private Long now_ms;

    private SrsSelfInfo self;
    private SrsSystemInfo system;
}
