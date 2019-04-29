package com.example.blog.core.config.web;

import com.example.blog.core.config.properties.BeetlProperties;
import com.ibeetl.starter.BeetlTemplateCustomize;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: eros
 * @Date: 2019/4/29 14:57
 * @Description:
 */
@Configuration("beetlConf")
public class BeetlConfig {

    @Autowired
    BeetlProperties beetlProperties;

    /**
     * @auther: eros
     * @date: 2019/4/29 16:06
     * @description beetl 配置
     * @return: org.beetl.ext.spring.BeetlGroupUtilConfiguration
     */
    @Bean(initMethod = "init",value = "beetlConfig")
    public BeetlConfiguration beetlConfiguration(){
        BeetlConfiguration configuration = new BeetlConfiguration();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if(loader == null){
            loader = BeetlConfig.class.getClassLoader();
        }
        configuration.setConfigProperties(beetlProperties.getProperties());
        configuration.setResourceLoader(new ClasspathResourceLoader(loader,beetlProperties.getPrefix()));
        return configuration;
    }

    /**
     * @auther: eros
     * @date: 2019/4/29 16:06
     * @description 视图解析器
     * @return: org.beetl.ext.spring.BeetlSpringViewResolver
     */
    @Bean("beetlViewResolver")
    public BeetlSpringViewResolver beetlSpringViewResolver(
            @Qualifier("beetlConfig") BeetlConfiguration beetlConfiguration){
        BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
        beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
        beetlSpringViewResolver.setSuffix(".html");
        beetlSpringViewResolver.setConfig(beetlConfiguration);
        beetlSpringViewResolver.setOrder(0);
        return beetlSpringViewResolver;
    }
}
