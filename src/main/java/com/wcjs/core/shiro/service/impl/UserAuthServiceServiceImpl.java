package com.wcjs.core.shiro.service.impl;

import com.wcjs.core.shiro.ShiroUser;
import com.wcjs.core.shiro.service.UserAuthService;
import com.wcjs.core.util.SpringContextHolder;
import com.wcjs.project.system.model.User;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@DependsOn("springContextHolder")
@Transactional(readOnly = true)
public class UserAuthServiceServiceImpl implements UserAuthService {

    public static UserAuthService me() {
        return SpringContextHolder.getBean(UserAuthService.class);
    }

    @Override
    public User user(String account) {
        return null;
    }

    @Override
    public ShiroUser shiroUser(User user) {
        return null;
    }

    @Override
    public List<String> findPermissionsByRoleId(Integer roleId) {
        return null;
    }

    @Override
    public String findRoleNameByRoleId(Integer roleId) {
        return null;
    }

    @Override
    public SimpleAuthenticationInfo info(ShiroUser shiroUser, User user, String realmName) {
        return null;
    }
}
