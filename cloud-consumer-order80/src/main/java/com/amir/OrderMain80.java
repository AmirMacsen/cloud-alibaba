package com.amir;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class OrderMain80 {
    public static void main( String[] args )
    {
        SpringApplication.run(OrderMain80.class, args);
        System.out.println("OrderMain80启动成功");
    }
}
