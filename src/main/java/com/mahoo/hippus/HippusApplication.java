package com.mahoo.hippus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@MapperScan("com.mahoo.hippus.mapper")
public class HippusApplication {

    public static void main(String[] args) {
        SpringApplication.run(HippusApplication.class, args);
    }

}
