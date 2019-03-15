package com.hziee.heavneye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class HeavneyeApplication {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HeavneyeApplication.class);

    }
    public static void main(String[] args) {
        SpringApplication.run(HeavneyeApplication.class, args);

    }


}
