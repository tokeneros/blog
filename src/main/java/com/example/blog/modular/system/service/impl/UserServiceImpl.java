package com.example.blog.modular.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.modular.system.entity.User;
import com.example.blog.modular.system.mapper.UserMapper;
import com.example.blog.modular.system.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Auther: eros
 * @Date: 2019/4/29 17:32
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{
}
