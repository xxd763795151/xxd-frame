package com.xxd.example.web;

import com.xxd.frame.boot.ApplicationStarter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.xxd.*")
public class Application {

    public static void main(String[] args) {
        ApplicationStarter.start(Application.class, args);
    }
}
