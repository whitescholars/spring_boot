package com.penglei.spring_boot.javaConfig;

import org.springframework.context.annotation.Bean;

/**
 * Created by pl on 2016/12/26.
 */
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UserFunctionService userFunctionService(){
        UserFunctionService userFunctionService=new UserFunctionService();
        userFunctionService.setFunctionService(functionService());
        return userFunctionService;
    }
}
