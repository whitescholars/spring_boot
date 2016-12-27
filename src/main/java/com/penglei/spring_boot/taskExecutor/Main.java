package com.penglei.spring_boot.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 多线程
 * Created by pl on 2016/12/26.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
        for(int i=0;i<10;i++){
            asyncTaskService.executeAsynTask(i);
            asyncTaskService.executeAsynTaskPlus(i);
        }
        context.close();
    }
}
