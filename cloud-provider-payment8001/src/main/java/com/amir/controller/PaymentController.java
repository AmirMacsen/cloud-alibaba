package com.amir.controller;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("payment")
public class PaymentController {
    @GetMapping("index")
    public String index() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "payment index";
    }

    @GetMapping("findById")
    public String findByID(@RequestParam("id") String id){
        return "商品Id: " + id;
    }
}
