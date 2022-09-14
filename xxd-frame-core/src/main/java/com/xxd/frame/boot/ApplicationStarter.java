package com.xxd.frame.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Author xuxd
 * @Date 2021-01-07 20:49:02
 * @Description xxd-frame
 **/
public class ApplicationStarter {

    public static void start(Class<?> source, String[] args) {
        ApplicationStarter.start(source, args, true);
    }

    public static void start(Class<?> source, String[] args, boolean isWeb) {

        SpringApplication application = new SpringApplicationBuilder()
            .sources(source)
            .web(isWeb ? WebApplicationType.SERVLET : WebApplicationType.NONE)
            .build();
        application.run(args);
    }
}
