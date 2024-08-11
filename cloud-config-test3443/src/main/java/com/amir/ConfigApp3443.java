package com.amir;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ConfigApp3443
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigApp3443.class, args);
        log.info("ConfigApp3443 started");
    }
}
