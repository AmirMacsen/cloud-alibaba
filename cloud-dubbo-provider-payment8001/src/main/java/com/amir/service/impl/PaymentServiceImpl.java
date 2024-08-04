package com.amir.service.impl;

import com.amir.service.IPaymentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

// methods表示什么方法要被注册到Dubbo
@DubboService(timeout = 3000,
        methods = {@Method(name="index", retries = 2)},
        cluster = "failfast")
public class PaymentServiceImpl implements IPaymentService {
    @Override
    public String index() {
        return "dubbo 调用成功了";
    }
}
