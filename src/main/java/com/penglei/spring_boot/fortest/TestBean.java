package com.penglei.spring_boot.fortest;

/**
 * Created by pl on 2016/12/29.
 */
public class TestBean {
    private String content;

    public TestBean(String content){
        super();
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
