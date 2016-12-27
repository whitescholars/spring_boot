package com.penglei.spring_boot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pl on 2016/12/26.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        UserFunctionService userFunctionService=context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHello("java config"));
        context.close();
    }
}
