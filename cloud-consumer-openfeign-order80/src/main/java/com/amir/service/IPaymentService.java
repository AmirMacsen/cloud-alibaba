package com.amir.service;

import com.amir.service.fallback.IPaymentServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "payment-provider", fallback = IPaymentServiceFallback.class)
@Service
public interface IPaymentService {
    @GetMapping("/payment/index")
    String index();
}

