package com.alibaba.cloud.integrated.order.database.order;

import com.alibaba.cloud.integrated.order.feign.AccountServiceFeignClient;
import com.alibaba.cloud.integrated.order.feign.StorageServiceFeignClient;
import com.alibaba.cloud.integrated.order.feign.dto.AccountDTO;
import com.alibaba.cloud.integrated.order.feign.dto.StorageDTO;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.bettercode.summer.data.jpa.BaseService;
import top.bettercode.summer.web.RespEntity;
import top.bettercode.summer.web.exception.BusinessException;

/**
 * 服务层实现
 */
@Service
public class OrderIntegService extends BaseService<Order, Long, OrderIntegRepository> {


  @Autowired
  private AccountServiceFeignClient accountService;

  @Autowired
  private StorageServiceFeignClient storageService;


  public OrderIntegService(OrderIntegRepository repository) {
    super(repository);
  }

  @GlobalTransactional
  public RespEntity<?> createOrder(String userId, String commodityCode, Integer count) {

    log.info("[createOrder] current XID: {}", RootContext.getXID());

    // deduct storage
    StorageDTO storageDTO = new StorageDTO();
    storageDTO.setCommodityCode(commodityCode);
    storageDTO.setCount(count);
    RespEntity<?> respEntity = storageService.reduceStock(storageDTO);
    if (!respEntity.isOk()) {
      throw new BusinessException("stock not enough");
    }

    // deduct balance
    int price = count * 2;
    AccountDTO accountDTO = new AccountDTO();
    accountDTO.setUserId(userId);
    accountDTO.setPrice(price);
    RespEntity<?> reduceBalance = accountService.reduceBalance(accountDTO);
    if (!reduceBalance.isOk()) {
      throw new BusinessException("balance not enough");
    }

    // save order
    Order order = new Order();
    order.setUserId(userId);
    order.setCommodityCode(commodityCode);
    order.setCount(count);
    order.setMoney(price);
    order.setCreateTime(LocalDateTime.now());
    order.setUpdateTime(LocalDateTime.now());
    repository.save(order);
    log.info("[createOrder] orderId: {}", order.getId());

    return RespEntity.ok(order);
  }

}