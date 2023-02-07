package com.alibaba.cloud.integrated.order.database.order;

import com.alibaba.cloud.integrated.order.support.IntegController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.bettercode.summer.web.RespEntity;
import top.bettercode.summer.web.exception.BusinessException;

/**
 * 接口
 */
@ConditionalOnWebApplication
@Validated
@RestController
@RequestMapping(value = "/order", name = "")
public class OrderIntegController extends IntegController {

  private final OrderIntegService orderIntegService;

  public OrderIntegController(OrderIntegService orderIntegService) {
    this.orderIntegService = orderIntegService;
  }

  @PostMapping("/create")
  public RespEntity<?> createOrder(@RequestParam("userId") String userId,
      @RequestParam("commodityCode") String commodityCode,
      @RequestParam("count") Integer count) {
    RespEntity<?> res;
    try {
      res = orderIntegService.createOrder(userId, commodityCode, count);
    } catch (BusinessException e) {
      return RespEntity.fail(e.getMessage());
    }
    return res;
  }

}