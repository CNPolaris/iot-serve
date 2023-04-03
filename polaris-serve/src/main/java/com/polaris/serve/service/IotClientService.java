package com.polaris.serve.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.polaris.mbg.entity.IotGateway;
import com.polaris.common.dto.RespBean;

/**
 * @author: polaris
 */
public interface IotClientService extends IService<IotGateway> {
    RespBean authGateway(String[] strings);
}
