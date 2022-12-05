package com.example.forumserve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.forumserve.dao")
@SpringBootApplication
public class ForumServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForumServeApplication.class, args);
    }

}
