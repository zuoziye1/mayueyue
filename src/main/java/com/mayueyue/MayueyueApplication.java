package com.mayueyue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.mayueyue.mapper")
@SpringBootApplication
public class MayueyueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MayueyueApplication.class, args);
    }

}
