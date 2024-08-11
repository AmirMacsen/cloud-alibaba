package com.amir;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class Bank1AppMain
{
    public static void main( String[] args )
    {
        SpringApplication.run(Bank1AppMain.class, args);
        log.info("cloud-seata-bank1 started");
    }
}
