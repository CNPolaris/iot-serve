package com.polaris.serve.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.polaris.mbg.entity.SysPermission;
import com.polaris.serve.service.SysPermissionService;
import com.polaris.mbg.mapper.SysPermissionMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author tian
* @description 针对表【sys_permission】的数据库操作Service实现
* @createDate 2023-04-02 14:00:37
*/
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission>
implements SysPermissionService{
    @Resource
    private SysPermissionMapper permissionMapper;

    @Override
    public List<SysPermission> queryAll() {
        return permissionMapper.selectList(new QueryWrapper<>());
    }
}
