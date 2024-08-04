package com.amir.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * 订单业务层
 */
@Service
public class OrderService {

    // 远程调用, mock 申明服务降级的处理
    @DubboReference(mock = "com.amir.service.fallback.PaymentServiceFallBack")
    private IPaymentService paymentService;

    public String index() {
        return paymentService.index();
    }
}
