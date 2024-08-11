package com.amir.service;

import com.amir.service.fallback.IPaymentServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "payment-provider")
@Service
public interface IPaymentService {
    @GetMapping("/payment/index")
    String index();

    /**
     * 根据商品Id查询商品
     * @param id
     * @return
     */
    @GetMapping("/payment/findById")
    String findById(@RequestParam("id")String id);
}

