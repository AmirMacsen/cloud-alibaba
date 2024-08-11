package com.amir.service.impl;

import com.amir.entity.AccountInfo;
import com.amir.repository.AccountRepository;
import com.amir.service.IAccountService;
import io.seata.core.context.RootContext;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 转账业务层
 * @author Amir
 */

@Service
@Slf4j
public class AccountService implements IAccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    @Transactional
    public void transfer(String accountNo, Double balance) {
        log.info("bank1 xid: {}", RootContext.getXID());
        // 1.获取银行卡信息
        AccountInfo accountInfo = repository.findByAccountNumber(accountNo);
        if (accountInfo != null) {
            accountInfo.setAccountBalance(accountInfo.getAccountBalance() + balance);
            repository.save(accountInfo);
        }else{
            throw new RuntimeException("银行卡不存在");
        }
    }
}
