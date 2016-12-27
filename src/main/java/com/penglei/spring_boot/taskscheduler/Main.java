package com.penglei.spring_boot.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 多线程
 * Created by pl on 2016/12/26.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
       /* SchedulerService schedulerService=context.getBean(SchedulerService.class);*//*
      *//*  schedulerService.reportCurretTime();
        schedulerService.reportCurretTime1();
        schedulerService.fixTimeExecute();*//*
      *//*  context.close();*/
    }
}
