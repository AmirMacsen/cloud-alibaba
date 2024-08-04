package com.amir.service.fallback;

import com.amir.service.IPaymentService;

/**
 * 支付服务存在异常的时候执行fallback
 */
public class PaymentServiceFallBack implements IPaymentService {
    @Override
    public String index() {
        return "服务繁忙，请稍后再试";
    }
}
