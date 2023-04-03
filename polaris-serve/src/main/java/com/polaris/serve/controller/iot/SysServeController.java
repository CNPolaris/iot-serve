package com.polaris.serve.controller.iot;

import com.polaris.api.iot.SysServeApi;
import com.polaris.common.dto.RespBean;
import com.polaris.mbg.entity.SysServe;
import com.polaris.model.iot.GetServerAddressResponse;
import com.polaris.model.iot.ServerItemResp;
import com.polaris.serve.service.SysServeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SysServeController implements SysServeApi {

    @Autowired
    private SysServeService serveService;

    /**
     * GET /iot/api/serve/address : 服务器列表
     *
     * @param principal
     * @param authorization (optional)
     * @return 成功 (status code 200)
     */
    @Override
    public ResponseEntity<RespBean> iotServerAddressList(Principal principal, String authorization) {
        GetServerAddressResponse response = new GetServerAddressResponse();
        List<SysServe> addressList = serveService.getServeAddressList();
        if (addressList.isEmpty()){
            response.setList(null);
        } else {
            List<ServerItemResp> list = new ArrayList<>();
            addressList.forEach(item->{
                list.add(new ServerItemResp(item.getId(), item.getName(), item.getAddress(), item.getStatus()));
            });
            response.setList(list);
        }
        return new ResponseEntity<>(RespBean.success(response), HttpStatus.OK);
    }
}
