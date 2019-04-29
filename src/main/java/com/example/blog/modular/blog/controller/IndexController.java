package com.example.blog.modular.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: eros
 * @Date: 2019/4/29 16:37
 * @Description:
 */
@Controller
@RequestMapping("/blog")
public class IndexController {

    private static final String PREFIX = "/blog";

    @RequestMapping
    public String index(){
        return PREFIX + "/index";
    }

}
