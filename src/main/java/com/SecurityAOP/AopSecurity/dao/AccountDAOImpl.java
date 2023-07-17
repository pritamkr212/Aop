package com.SecurityAOP.AopSecurity.dao;

import com.SecurityAOP.AopSecurity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    private String name;
    private String serviceCode;
    @Override
    public void addAccount(Account account,boolean vipFlag) {
        System.out.println("Adding the account");
    }

    @Override
    public boolean isAccountExist() {
        System.out.println("Account Existed!");
        return true;
    }

    public String getName() {
        System.out.println("GettingName");
        return name;
    }

    public void setName(String name) {
        System.out.println("SettingName");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println("GettingServiceCode");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println("settingServiceCode");
        this.serviceCode = serviceCode;
    }
}
