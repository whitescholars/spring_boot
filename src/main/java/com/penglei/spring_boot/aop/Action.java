package com.penglei.spring_boot.aop;

import java.lang.annotation.*;

/**
 * Created by pl on 2016/12/27.
 * 自定义注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
