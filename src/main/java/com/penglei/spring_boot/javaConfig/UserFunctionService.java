package com.penglei.spring_boot.javaconfig;

/**
 * Created by pl on 2016/12/26.
 */

public class UserFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
