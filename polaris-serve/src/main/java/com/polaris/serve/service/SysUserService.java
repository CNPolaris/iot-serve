package com.polaris.serve.service;

import com.polaris.model.user.login.UserLoginRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.mbg.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.userdetails.UserDetails;

/**
* @author tian
* @description 针对表【sys_user】的数据库操作Service
* @createDate 2023-04-02 14:00:41
*/
public interface SysUserService extends IService<SysUser> {
    UserDetails loadUserByUsername(String email);
    RespBean userLogin(UserLoginRequest request);

    Long getUserIdByName(String email);
}
