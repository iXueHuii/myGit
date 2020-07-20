package com.wcjs.core.constant.factory;

import com.wcjs.core.util.SpringContextHolder;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *  常量的生产工厂
 */
@Component
@DependsOn("springContextHolder")
public class ConstantFactory implements IConstantFactory{

    public static IConstantFactory me() {
        return SpringContextHolder.getBean("constantFactory");
    }

    @Override
    public String getUserNameById(Integer userId) {
        return null;
    }

    @Override
    public String getUserAccountById(Integer userId) {
        return null;
    }

    @Override
    public String getRoleName(String roleIds) {
        return null;
    }

    @Override
    public String getSingleRoleName(Integer roleId) {
        return null;
    }

    @Override
    public String getSingleRoleTip(Integer roleId) {
        return null;
    }

    @Override
    public String getDeptName(Integer deptId) {
        return null;
    }

    @Override
    public String getMenuNames(String menuIds) {
        return null;
    }

    @Override
    public String getMenuName(Long menuId) {
        return null;
    }

    @Override
    public String getMenuNameByCode(String code) {
        return null;
    }

    @Override
    public String getSexName(Integer sex) {
        return null;
    }

    @Override
    public String getStatusName(Integer status) {
        return null;
    }

    @Override
    public String getMenuStatusName(Integer status) {
        return null;
    }

    @Override
    public String getCacheObject(String para) {
        return null;
    }

    @Override
    public List<Integer> getSubDeptId(Integer deptid) {
        return null;
    }

    @Override
    public List<Integer> getParentDeptIds(Integer deptid) {
        return null;
    }
}
