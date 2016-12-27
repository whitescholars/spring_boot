package com.penglei.spring_boot.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pl on 2016/12/27.
 */
@Service
public class SchedulerService {
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate=5000)
    public void reportCurretTime(){
        System.out.println("(周期是以上一个任务开始时间为基准)每5秒钟执行一次:"+SIMPLE_DATE_FORMAT.format(new Date()));
    }

    @Scheduled(fixedDelay=5000)
    public void reportCurretTime1(){
        System.out.println("(周期是以上一个调用任务的完成时间为基准)每5秒钟执行一次:"+SIMPLE_DATE_FORMAT.format(new Date()));
    }
    @Scheduled(cron="0 06 16 ? * *")
    public void fixTimeExecute(){
        System.out.println("指定的时间内执行一次"+SIMPLE_DATE_FORMAT.format(new Date()));
    }
}
