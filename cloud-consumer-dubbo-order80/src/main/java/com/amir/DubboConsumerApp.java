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
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
@EnableDubbo
public class DubboConsumerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run( DubboConsumerApp.class, args);
        log.info("dubbo consumer 启动成功");
    }
}
