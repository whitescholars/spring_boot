package com.penglei.spring_boot.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by pl on 2016/12/27.
 */
@Configuration
@ComponentScan("com.penglei.spring_boot.aop")
@EnableAspectJAutoProxy  //开启spring 代理
public class AopConfig {

}
