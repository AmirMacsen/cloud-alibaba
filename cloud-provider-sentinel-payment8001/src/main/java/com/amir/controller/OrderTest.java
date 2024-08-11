package com.amir.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单服务
 */
@RestController
@RequestMapping("order")
public class OrderTest {
    @SentinelResource(value = "order-provider")
    @RequestMapping("findById")
    public String index(@RequestParam("id") String id) {
        return "order index";
    }
}