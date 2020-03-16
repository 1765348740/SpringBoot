package com.zlx.case16;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zlx.case16.dao")
public class Case16Application {

    public static void main(String[] args) {
        SpringApplication.run(Case16Application.class, args);
    }

}
