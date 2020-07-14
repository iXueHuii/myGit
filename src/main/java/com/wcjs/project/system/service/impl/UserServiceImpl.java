package com.wcjs.project.system.service.impl;

import com.wcjs.project.system.model.User;
import com.wcjs.project.system.dao.UserMapper;
import com.wcjs.project.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author xueHui
 * @since 2020-07-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
