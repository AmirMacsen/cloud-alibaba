package com.amir.service.fallback;

import com.amir.service.IPaymentService;
import org.springframework.stereotype.Component;

@Component
public class IPaymentServiceFallback implements IPaymentService {
    @Override
    public String index() {
        return "服务繁忙，请稍等片刻";
    }

    @Override
    public String findById(String id) {
        return "";
    }
}
