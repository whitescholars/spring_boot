package com.penglei.spring_boot.helloworld;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pl on 2016/12/26.
 */
//表明该类是一个配置类
@Configuration
//配置一个自动扫描
@ComponentScan("com.penglei.spring_boot.helloworld")
public class HelloConfig {

}
