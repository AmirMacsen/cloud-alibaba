package com.amir;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 *
 */
// 开启注册发现服务
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class Payment8001 {
    public static void main( String[] args ) {
        SpringApplication.run( Payment8001.class, args);
        log.info("Payment8001启动成功");
    }
}
