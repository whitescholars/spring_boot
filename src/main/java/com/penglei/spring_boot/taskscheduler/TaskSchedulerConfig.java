package com.penglei.spring_boot.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by pl on 2016/12/27.
 */
@Configuration
@ComponentScan("com.penglei.spring_boot.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
