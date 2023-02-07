package com.alibaba.cloud.integrated.account.database.account;

import io.seata.core.context.RootContext;
import java.sql.Timestamp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.bettercode.summer.data.jpa.BaseService;
import top.bettercode.summer.web.RespEntity;
import top.bettercode.summer.web.exception.BusinessException;

/**
 * 服务层实现
 */
@Service
public class AccountIntegService extends BaseService<Account, Long, AccountIntegRepository> {


  public AccountIntegService(AccountIntegRepository repository) {
    super(repository);
  }

  @Transactional
  public void reduceBalance(String userId, Integer price) throws BusinessException {
    log.info("[reduceBalance] currenet XID: {}", RootContext.getXID());

    checkBalance(userId, price);

    Timestamp updateTime = new Timestamp(System.currentTimeMillis());
    int updateCount = repository.reduceBalance(userId, price, updateTime);
    if (updateCount == 0) {
      throw new BusinessException("reduce balance failed");
    }
  }

  public RespEntity<?> getRemainAccount(String userId) {
    Integer balance = repository.getBalance(userId);
    if (balance == null) {
      return RespEntity.fail("wrong userId,please check the userId");
    }
    return RespEntity.ok(balance);
  }

  private void checkBalance(String userId, Integer price) throws BusinessException {
    Integer balance = repository.getBalance(userId);
    if (balance < price) {
      throw new BusinessException("no enough balance");
    }
  }

}