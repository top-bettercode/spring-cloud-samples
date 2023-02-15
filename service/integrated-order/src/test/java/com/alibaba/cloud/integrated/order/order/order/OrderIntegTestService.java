package com.alibaba.cloud.integrated.order.order.order;

import com.alibaba.cloud.integrated.order.order.order.Order;
import com.alibaba.cloud.integrated.order.order.order.OrderIntegService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Service;

/**
 *  测试服务层
 */
@ConditionalOnWebApplication
@Service
public class OrderIntegTestService {

  @Autowired
  private OrderIntegService orderIntegService;

  public Order insertOrder() {
    Order order = new Order();
    order.setUserId("");
    order.setCommodityCode("");
    order.setCount(1);
    order.setCreateTime(LocalDateTime.now());
    order.setUpdateTime(LocalDateTime.now());
    order.nullPropertySetWithDefaults();
    orderIntegService.save(order);
    System.err.println("------------------------------------------------------");
    return order;
  }
}