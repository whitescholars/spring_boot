package com.penglei.spring_boot.parmeterInject;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by pl on 2016/12/27.
 */
@Configuration
@ComponentScan("com.penglei.spring_boot")
@PropertySource("classpath:test.properties")
public class ResourcesService {
    @Value("I Love You!")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random()*100}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String another;
    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;
    @Value("${code.author}")
    private String author;
    @Value("${code.name}")
    private String name;
    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    public void output() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(another);
            System.out.println("222"+IOUtils.toString(testFile.getInputStream(), "UTF-8"));
            //访问网址
            System.out.println("111"+IOUtils.toString(testUrl.getInputStream(),"UTF-8"));
            //获取网址
            System.out.println("testUrl.getURL():"+testUrl.getURL());
            System.out.println(name);
            System.out.println(author);
            System.out.println(environment.getProperty("code.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
