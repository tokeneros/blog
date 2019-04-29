package com.example.blog.modular.system.controller;

import com.example.blog.modular.base.controller.BaseController;
import com.example.blog.modular.system.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: eros
 * @Date: 2019/4/29 17:39
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController<IUserService> {



}
