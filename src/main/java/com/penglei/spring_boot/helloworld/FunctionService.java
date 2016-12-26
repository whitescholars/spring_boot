package com.penglei.spring_boot.helloworld;

import org.springframework.stereotype.Service;

/**
 * Created by pl on 2016/12/26.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello"+" "+word+"!";
    }
}
