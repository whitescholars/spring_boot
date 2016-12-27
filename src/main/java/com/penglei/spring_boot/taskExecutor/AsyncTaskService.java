package com.penglei.spring_boot.taskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by pl on 2016/12/27.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsynTask(Integer i){
        System.out.println("执行异步任务"+i);
    }

    @Async
    public void executeAsynTaskPlus(Integer i){
        System.out.println("执行异步任务Plus"+(i+1));
    }

}
