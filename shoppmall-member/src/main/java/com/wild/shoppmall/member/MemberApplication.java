package com.wild.shoppmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @Author: wild
 * @Date: 2024/5/31 12:58
 */
@SpringBootApplication
@MapperScan("com.wild.shoppmall.member.dao")
@EnableDiscoveryClient
@EnableFeignClients("com.wild.shoppmall.member.feign")
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
    }
}
