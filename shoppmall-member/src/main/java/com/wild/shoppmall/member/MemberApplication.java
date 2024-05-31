package com.wild.shoppmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @Author: wild
 * @Date: 2024/5/31 12:58
 */
@SpringBootApplication
@MapperScan("com.wild.shoppmall.member.dao")
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
    }
}
