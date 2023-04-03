package com.polaris.serve.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.polaris.model.iot.AuthGatewayResponse;
import com.polaris.mbg.entity.IotGateway;
import com.polaris.mbg.entity.IotProject;
import com.polaris.common.dto.RespBean;
import com.polaris.mbg.mapper.IotGatewayMapper;
import com.polaris.mbg.mapper.IotProjectMapper;
import com.polaris.serve.service.IotClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: polaris
 */
@Service
public class IotClientServiceImpl extends ServiceImpl<IotGatewayMapper, IotGateway> implements IotClientService {
    @Resource
    private IotProjectMapper projectMapper;
    @Resource
    private IotGatewayMapper gatewayMapper;
    @Override
    public RespBean authGateway(String[] strings) {
        try{
            QueryWrapper<IotProject> projectQueryWrapper = new QueryWrapper<IotProject>().eq("project_key", strings[0]);
            IotProject iotProject = projectMapper.selectOne(projectQueryWrapper);

            QueryWrapper<IotGateway> gatewayQueryWrapper = new QueryWrapper<IotGateway>().eq("gateway_key", strings[1]);
            IotGateway iotGateway = gatewayMapper.selectOne(gatewayQueryWrapper);
            if(iotGateway.getProjectId().equals(iotProject.getId())){
                AuthGatewayResponse gatewayResponse = new AuthGatewayResponse();
                gatewayResponse.setGatewayId(iotGateway.getId());
                gatewayResponse.setGatewayKey(iotGateway.getGatewayKey());
                return RespBean.success("验证通过", gatewayResponse);
            } else {
                return RespBean.error("网关密钥验证失败");
            }
        } catch (Exception e){
            return RespBean.error("网关密钥验证失败");
        }
    }

}
