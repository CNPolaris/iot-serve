package com.polaris.model.iot;

import lombok.Data;

import java.util.List;

@Data
public class GetTaskListResponse {
    private Long total;
    private Integer size;
    private List<TaskResponseBean> list;
}