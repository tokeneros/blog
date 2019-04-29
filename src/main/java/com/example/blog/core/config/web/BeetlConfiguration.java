package com.example.blog.core.config.web;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: eros
 * @Date: 2019/4/29 16:28
 * @Description:
 */
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    /**
     * @auther: eros
     * @date: 2019/4/29 16:29
     * @description 可以设置一些全局共享的参数信息
     * @return: void
     */
    @Override
    protected void initOther() {
        Map<String,Object> shared = new HashMap<String,Object>();
        shared.put("blog_name","B L O G");
        groupTemplate.setSharedVars(shared);
    }
}
