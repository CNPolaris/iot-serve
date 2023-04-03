package com.polaris.serve.service.impl;

import cn.hutool.core.codec.Rot;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.polaris.model.user.login.SysUserResponse;
import com.polaris.model.user.login.UserLoginRequest;
import com.polaris.model.user.login.UserLoginResponse;
import com.polaris.common.dto.RespBean;
import com.polaris.common.utils.Commons;
import com.polaris.mbg.entity.SysPermission;
import com.polaris.mbg.entity.SysUser;
import com.polaris.mbg.mapper.SysPermissionMapper;
import com.polaris.serve.bo.AdminUserDetails;
import com.polaris.serve.service.SysUserService;
import com.polaris.mbg.mapper.SysUserMapper;
import javax.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import com.polaris.security.util.JwtTokenUtil;
import java.util.List;

/**
* @author tian
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2023-04-02 14:00:41
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
implements SysUserService{
    @Resource
    private SysUserMapper userMapper;
    @Resource
    private SysPermissionMapper permissionMapper;
    @Resource
    private JwtTokenUtil jwtTokenUtil;
    @Override
    public UserDetails loadUserByUsername(String email) {
        SysUser user = userMapper.selectOne(new QueryWrapper<SysUser>().eq("email", email));
        List<SysPermission> permissionList = permissionMapper.selectList(new QueryWrapper<>());

        return new AdminUserDetails(user, permissionList);
    }

    @Override
    public RespBean userLogin(UserLoginRequest request) {
                try{
            QueryWrapper<SysUser> queryWrapper = new QueryWrapper<SysUser>().eq("email", request.getEmail());
            SysUser sysUser = userMapper.selectOne(queryWrapper);
            if(sysUser == null){
                return RespBean.error(Commons.CODE_NO_USER, Commons.ERROR_NO_USER);
            }
            if(!sysUser.getPassword().equals(Rot.decode13(request.getPassword()))) {
                return RespBean.error(Commons.CODE_NO_PASSWD, Commons.ERROR_NO_PASSWD);
            }
            UserDetails userDetails = loadUserByUsername(sysUser.getEmail());
            // 更新security登陆对象
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);

            String token = jwtTokenUtil.generatorToken(userDetails);

            UserLoginResponse userLoginResponse = new UserLoginResponse();
            userLoginResponse.setToken(token);
            userLoginResponse.setHeader("Bearer ");

            SysUserResponse userResponse = new SysUserResponse();
            BeanUtils.copyProperties(sysUser, userResponse);
            userLoginResponse.setUserInfo(userResponse);
            return RespBean.success("login successful!", userLoginResponse);
        } catch (Exception e){
            return RespBean.error(e.getMessage());
        }

    }

    @Override
    public Long getUserIdByName(String email) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<SysUser>().eq("email", email);
        SysUser sysUser = userMapper.selectOne(queryWrapper);

        return sysUser.getId();
    }
}
