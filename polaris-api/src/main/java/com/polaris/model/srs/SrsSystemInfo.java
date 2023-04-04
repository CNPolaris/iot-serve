package com.polaris.model.srs;

import lombok.Data;

@Data
public class SrsSystemInfo {
    private Double cpu_percent;
    private Integer disk_read_KBps;
    private Integer disk_write_KBps;
    private Double disk_busy_percent;
    private Integer mem_ram_kbyte;
    private Double mem_ram_percent;
    private Integer mem_swap_kbyte;
    private Double mem_swap_percent;
    private Integer cpus;
    private Integer cpus_online;
    private Double uptime;
    private Double ilde_time;
    private Double load_1m;
    private Double load_5m;
    private Double load_15m;
    private Long net_sample_time;
    private Integer net_recv_bytes;
    private Integer net_send_bytes;
    private Long net_recvi_bytes;
    private Long net_sendi_bytes;
    private Long srs_sample_time;
    private Long srs_recv_bytes;
    private Long srs_send_bytes;
    private Integer conn_sys;
    private Integer conn_sys_et;
    private Integer conn_sys_tw;
    private Integer conn_sys_udp;
    private Integer conn_srs;
}
