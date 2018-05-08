package com.code.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liumingyu
 * @create 2018-05-08 上午10:18
 */
@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages = "com.code.community.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
