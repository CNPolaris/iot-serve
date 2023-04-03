package com.polaris.serve.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.polaris.common.utils.Commons;
import com.polaris.mbg.entity.SysServe;
import com.polaris.mbg.mapper.SysPermissionMapper;
import com.polaris.serve.service.SysServeService;
import com.polaris.mbg.mapper.SysServeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author tian
* @description 针对表【sys_serve】的数据库操作Service实现
* @createDate 2023-04-03 13:50:45
*/
@Service
public class SysServeServiceImpl extends ServiceImpl<SysServeMapper, SysServe>
    implements SysServeService{
    @Resource
    private SysServeMapper serveMapper;

    @Override
    public List<SysServe> getServeAddressList() {
        return serveMapper.selectList(new QueryWrapper<SysServe>().eq("status", Commons.YES));
    }
}




