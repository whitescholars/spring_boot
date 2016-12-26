package com.penglei.spring_boot.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pl on 2016/12/26.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HelloConfig.class);
        UserFunctionService userFunctionService=context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHello("spring_boot"));
        context.close();
    }

}
