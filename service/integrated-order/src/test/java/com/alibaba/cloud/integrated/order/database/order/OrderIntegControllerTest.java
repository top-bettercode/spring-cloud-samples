package com.alibaba.cloud.integrated.order.database.order;

import com.alibaba.cloud.integrated.order.support.BaseWebTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;

/**
 *  控制层测试
 */
@DisplayName("")
@Transactional
@TestMethodOrder(OrderAnnotation.class)
public class OrderIntegControllerTest extends BaseWebTest {

  @Autowired
  private OrderIntegService orderIntegService;

  @Autowired
  private OrderIntegTestService orderIntegTestService;

  @Override
  public void beforeEach() throws Exception {
    tableNames(Order.TABLE_NAME);
  }
  @Test
  public void saveForm() throws Exception {
    Long id = orderIntegTestService.insertOrder().getId();
    
    perform(post("/order/create")
        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
        .param("userId", "")
        .param("commodityCode", "")
        .param("count", "1")
    );
  }

}