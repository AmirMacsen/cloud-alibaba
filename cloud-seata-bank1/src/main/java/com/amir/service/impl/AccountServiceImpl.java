package com.amir.service.impl;

import com.amir.entity.AccountInfo;
import com.amir.feign.FeignAccountService;
import com.amir.repository.AccountInfoRepository;
import com.amir.service.IAccountService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AccountServiceImpl implements IAccountService {
    private final AccountInfoRepository accountInfoRepository;
    private final FeignAccountService feignAccountService;

    @Autowired
    public AccountServiceImpl(AccountInfoRepository accountInfoRepository, FeignAccountService feignAccountService){
        this.accountInfoRepository = accountInfoRepository;
        this.feignAccountService = feignAccountService;
    }

    /**
     * 转账给别人，应该是一个原子性操作，因为涉及本地账号余额的减少和远程服务账号余额的增加
     * @param accountNo 账号
     * @param balance 金额
     */
    @GlobalTransactional
    @Transactional
    @Override
    public void toTransfer(String accountNo, String toAccountNo, Double balance) {
        log.info("bank2 xid: {}", RootContext.getXID());
        // 1. 获取自己账户的信息
        AccountInfo myAccountInfo = accountInfoRepository.findAccountInfoByAccountNumber(accountNo);
        if (myAccountInfo != null){
            // 2. 给别人转钱
            // 2.1 减少自己的账户余额
            myAccountInfo.setAccountBalance(myAccountInfo.getAccountBalance() - balance);
            accountInfoRepository.save(myAccountInfo);
            // 2.2 增加别人的账户余额, 这里是远程服务
            feignAccountService.transfer(toAccountNo, balance);
        }else {
            throw new RuntimeException("本地账户不存在");
        }
    }
}
