package com.alibaba.cloud.integrated.account.database.account;

import com.alibaba.cloud.integrated.account.support.BaseWebTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;

/**
 * 控制层测试
 */
@DisplayName("")
@Transactional
@TestMethodOrder(OrderAnnotation.class)
public class AccountIntegControllerTest extends BaseWebTest {

  @Autowired
  private AccountIntegService accountIntegService;

  @Autowired
  private AccountIntegTestService accountIntegTestService;

  @Override
  public void beforeEach() throws Exception {
    tableNames(Account.TABLE_NAME);
  }

  @DisplayName("列表")
  @Test
  @Order(0)
  public void list() throws Exception {
    accountIntegTestService.insertAccount();

    perform(get("/account")
        .param("userId", "1")
    );
  }

  @DisplayName("保存(application/json)")
  @Test
  @Order(3)
  public void saveBody() throws Exception {
    Long id = accountIntegTestService.insertAccount().getId();

    AccountDTO account = new AccountDTO();
    account.setUserId("");
    account.setPrice(0);

    perform(post("/account/reduce-balance")
        .contentType(MediaType.APPLICATION_JSON)
        .content(json(account))
    );
  }

}