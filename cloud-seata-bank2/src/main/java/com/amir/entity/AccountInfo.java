package com.amir.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 账户信息表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account_info")
public class AccountInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_no")
    private String accountNumber;

    @Column(name = "account_balance")
    private Double accountBalance;

    @Column(name = "account_password")
    private String accountPassword;
}
