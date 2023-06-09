package com.polaris.serve.bo;

import com.polaris.mbg.entity.SysUser;
import com.polaris.mbg.entity.SysPermission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AdminUserDetails implements UserDetails {
    private final SysUser user;

    private final List<SysPermission> permissionList;

    public AdminUserDetails(SysUser user, List<SysPermission> permissionList) {
        this.user = user;
        this.permissionList = permissionList;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return permissionList.stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getId()+":"+permission.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getStatus().equals(0);
    }

}
