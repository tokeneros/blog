package com.example.blog.modular.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Auther: eros
 * @Date: 2019/4/29 17:42
 * @Description: 给所有Controller统一提供 共有 属性，方法
 */
@Controller
public class BaseController<T> {

    @Autowired
    private T baseService;

}
