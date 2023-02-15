package com.alibaba.cloud.integrated.account.account.account;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Service;

/**
 *  测试服务层
 */
@ConditionalOnWebApplication
@Service
public class AccountIntegTestService {

  @Autowired
  private AccountIntegService accountIntegService;

  public Account insertAccount() {
    Account account = new Account();
    account.setUserId("");
    account.setCreateTime(LocalDateTime.now());
    account.setUpdateTime(LocalDateTime.now());
    account.nullPropertySetWithDefaults();
    accountIntegService.save(account);
    System.err.println("------------------------------------------------------");
    return account;
  }
}