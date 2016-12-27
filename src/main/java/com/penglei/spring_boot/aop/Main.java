package com.penglei.spring_boot.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pl on 2016/12/27.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService=context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService=context.getBean(DemoMethodService.class);
        demoMethodService.add();
        demoAnnotationService.add();
        context.close();
    }
}
