package com.xxd.example.web.controller;

import com.xxd.example.domain.ExampleBean;
import com.xxd.example.iservice.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    private IExampleService exampleService;

    @GetMapping("/hi")
    public ExampleBean example() {
        return exampleService.getExampleBean();
    }
}
