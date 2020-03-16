package com.zlx.case11;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zlx.case11.dao")
public class Case11Application {

    public static void main(String[] args) {
        SpringApplication.run(Case11Application.class, args);
    }

}
