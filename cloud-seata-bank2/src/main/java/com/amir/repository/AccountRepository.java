package com.amir.repository;

import com.amir.entity.AccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AccountRepository extends JpaRepository<AccountInfo, Integer> {
    /**
     * 根据账号查询账号信息
     * @param accountNumber 账号名称
     * @return
     */
    AccountInfo findByAccountNumber(String accountNumber);
}
