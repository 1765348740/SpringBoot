package com.zlx.case10;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zlx.case10.dao")
public class Case10Application {

    public static void main(String[] args) {
        SpringApplication.run(Case10Application.class, args);
    }

}
