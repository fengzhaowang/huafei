package com.huafei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huafei.mapper")
public class HuafeiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuafeiApplication.class, args);
    }

}
