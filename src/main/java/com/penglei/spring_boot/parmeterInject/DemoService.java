package com.penglei.spring_boot.parmeterInject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by pl on 2016/12/27.
 */
@Service
public class DemoService {
    @Value("其他的属性")
    private String another;
    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
