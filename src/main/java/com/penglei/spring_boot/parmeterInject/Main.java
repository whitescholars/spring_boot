package com.penglei.spring_boot.parmeterInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pl on 2016/12/26.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(InjectConfig.class);
        ResourcesService resourcesService=context.getBean(ResourcesService.class);
        resourcesService.output();
        context.close();
    }
}
