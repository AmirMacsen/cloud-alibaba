package com.amir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Bank2AppMain
{
    public static void main( String[] args )
    {
        SpringApplication.run( Bank2AppMain.class, args);
    }
}
