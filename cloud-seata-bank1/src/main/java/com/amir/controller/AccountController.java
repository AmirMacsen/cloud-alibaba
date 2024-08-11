package com.amir.controller;

import com.amir.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @GetMapping("transfer")
    public String transfer(@RequestParam("accountNo") String accountNo,
                           @RequestParam("toAccountNo")String toAccountNo,
                           @RequestParam("balance") Double balance) {

        try {
            accountService.toTransfer(accountNo, toAccountNo, balance);
            return "给他人转账成功";
        }catch (Exception e){
            return "转账发生异常";
        }
    }
}
