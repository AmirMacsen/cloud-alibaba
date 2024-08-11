package com.amir.repository;

import com.amir.entity.AccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountInfoRepository extends JpaRepository<AccountInfo, Integer> {
    /**
     * 根据账号查询
     * @param accountNumber 银行卡号
     * @return AccountInfo
     */
    AccountInfo findAccountInfoByAccountNumber(String accountNumber);
}
