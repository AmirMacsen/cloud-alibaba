package com.amir.service;

public interface IAccountService {
    /**
     * 转账给账户
     */
    void toTransfer(String accountNo, String toAccountNo, Double balance);
}
