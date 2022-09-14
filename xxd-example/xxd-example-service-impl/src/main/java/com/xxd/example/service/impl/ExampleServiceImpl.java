package com.xxd.example.service.impl;

import com.xxd.example.domain.ExampleBean;
import com.xxd.example.iservice.IExampleService;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements IExampleService {
    @Override public ExampleBean getExampleBean() {
        ExampleBean bean = new ExampleBean();
        bean.setContent("This is a example!");
        return bean;
    }
}
