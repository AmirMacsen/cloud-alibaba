package com.amir.service.fallback;

public class CommonFallback {
    public static String fallback(String id, Throwable throwable){
        return "服务调用降级";
    }
}
