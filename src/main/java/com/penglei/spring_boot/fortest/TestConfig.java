package com.penglei.spring_boot.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by pl on 2016/12/29.
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from dev");
    }

    @Bean
    @Profile("pro")
    public TestBean proTestBean(){
        return new TestBean("from pro");
    }
}
