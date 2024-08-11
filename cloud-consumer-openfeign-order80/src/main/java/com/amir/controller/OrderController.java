package com.amir.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.amir.service.IPaymentService;
import com.amir.service.fallback.CommonFallback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  @SentinelResource(value = "order-consumer",
          fallback = "fallback", fallbackClass = CommonFallback.class)
  @RequestMapping("findById")
    public String findById(@RequestParam("id") String id){
      if (id.equals("1")){
          throw new RuntimeException("查询失败");
      }
      return paymentService.findById(id);
  }

    /**
     * 接口异常，降级的方法
     * @param id
     * @return
     */
  public String orderFallBack(String id, Throwable throwable){
      return "接口异常，降级的方法";
  }

    @SentinelResource(value = "order-consumer02",
    blockHandler = "blockHandler")
    @RequestMapping("findById02")
    public String findById02(@RequestParam("id") String id){
      return paymentService.findById(id);
  }

  public String blockHandler(String id, BlockException e){
      return "接口异常，降级的方法";
  }
}
