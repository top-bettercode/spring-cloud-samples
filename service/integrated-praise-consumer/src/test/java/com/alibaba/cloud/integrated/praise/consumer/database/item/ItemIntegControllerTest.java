package com.alibaba.cloud.integrated.praise.consumer.database.item;

import com.alibaba.cloud.integrated.praise.consumer.support.BaseWebTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *  控制层测试
 */
@DisplayName("")
@Transactional
@TestMethodOrder(OrderAnnotation.class)
public class ItemIntegControllerTest extends BaseWebTest {

  @Autowired
  private ItemIntegService itemIntegService;

  @Autowired
  private ItemIntegTestService itemIntegTestService;

  @Override
  public void beforeEach() throws Exception {
    tableNames(Item.TABLE_NAME);
  }


}