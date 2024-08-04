package com.amir.controller;

import com.amir.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("order")
public class OrderController {
    @Autowired
    private IPaymentService paymentService;

  @RequestMapping("index")
  public String paymentOk(){
      log.info("请求进来了");
    return paymentService.index();
  }
}
