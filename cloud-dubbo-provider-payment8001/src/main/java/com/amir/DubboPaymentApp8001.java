package com.amir;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@EnableDubbo
@SpringBootApplication
@Slf4j
public class DubboPaymentApp8001
{
    public static void main( String[] args )
    {
        SpringApplication.run( DubboPaymentApp8001.class, args);
    }
}
