package com.alibaba.cloud.integrated.account.account.account;

import com.alibaba.cloud.integrated.account.support.IntegController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.bettercode.summer.web.RespEntity;
import top.bettercode.summer.web.exception.BusinessException;

/**
 * 接口
 */
@ConditionalOnWebApplication
@Validated
@RestController
@RequestMapping(value = "/account", name = "account")
public class AccountIntegController extends IntegController {

  private final AccountIntegService accountIntegService;

  public AccountIntegController(AccountIntegService accountIntegService) {
    this.accountIntegService = accountIntegService;
  }

  @PostMapping("/reduce-balance")
  public Object reduceBalance(@RequestBody AccountDTO accountDTO) {
    try {
      accountIntegService.reduceBalance(accountDTO.getUserId(), accountDTO.getPrice());
    } catch (BusinessException e) {
      return RespEntity.fail(e.getMessage());
    }
    return RespEntity.ok("");
  }

  @GetMapping("/")
  public Object getRemainAccount(String userId) {
    return accountIntegService.getRemainAccount(userId);
  }

}