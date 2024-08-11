package com.amir.service;

/**
 * 转账接口
 */
public interface IAccountService {
    /**
     * 转账接口
     * @param accountNo 卡号
     * @param balance 金额
     */
    void transfer(String accountNo, Double balance);
}
