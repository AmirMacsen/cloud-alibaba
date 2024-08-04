package com.amir;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableFeignClients // 开启feign的扫描
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.amir"})
@Slf4j
public class OpenFeginOrderApp
{
    public static void main( String[] args )
    {
        SpringApplication.run( OpenFeginOrderApp.class, args);
        log.info("OpenFeign started");
    }
}
