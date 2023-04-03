package com.polaris.serve.service;

import com.polaris.mbg.entity.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author tian
* @description 针对表【sys_permission】的数据库操作Service
* @createDate 2023-04-02 14:00:37
*/
public interface SysPermissionService extends IService<SysPermission> {
    List<SysPermission> queryAll();
}
