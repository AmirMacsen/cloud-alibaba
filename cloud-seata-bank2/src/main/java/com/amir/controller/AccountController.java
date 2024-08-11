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

    /**
     * 转账的接口
     * @param accountNo 银行卡卡号
     * @param balance 转账金额
     * @return str
     */
    @GetMapping("transfer")
    public String transfer(@RequestParam("accountNo") String accountNo,
                           @RequestParam("balance") Double balance) {
        try {
            accountService.transfer(accountNo, balance);
            return "转账成功";
        }catch (Exception e){
            return "服务器内部错误，转账失败";
        }
    }
}
