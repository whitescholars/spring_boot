package com.penglei.spring_boot.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 * Created by pl on 2016/12/27.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的Add操作")
    public void add(){}
}
