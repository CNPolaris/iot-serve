package com.polaris.model.iot;

import lombok.Data;

import java.util.List;

@Data
public class GetServerAddressResponse {
    private List<ServerItemResp> list;
}
