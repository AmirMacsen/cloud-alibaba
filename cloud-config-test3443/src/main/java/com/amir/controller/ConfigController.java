package com.amir.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 动态刷新配置
@RestController
@RequestMapping("config")
public class ConfigController {
    @Value("${nacos.config}")
    private  String config;

    @RequestMapping("index")
    public String index()
    {
        return config;
    }
}
