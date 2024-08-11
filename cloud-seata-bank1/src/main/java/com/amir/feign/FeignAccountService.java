package com.amir.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程调用的接口
 */
@FeignClient("cloud-bank2-provider")
public interface FeignAccountService {
    @GetMapping("/account/transfer")
    String transfer(@RequestParam("accountNo") String accountNo, @RequestParam("balance") Double balance);
}
