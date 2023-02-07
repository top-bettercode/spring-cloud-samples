package com.alibaba.cloud.integrated.praise.consumer.database.item;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Service;

/**
 *  测试服务层
 */
@ConditionalOnWebApplication
@Service
public class ItemIntegTestService {

  @Autowired
  private ItemIntegService itemIntegService;

  public Item insertItem() {
    Item item = new Item();
    item.setPraise(1);
    item.setCreateTime(LocalDateTime.now());
    item.setUpdateTime(LocalDateTime.now());
    itemIntegService.save(item);
    System.err.println("------------------------------------------------------");
    return item;
  }
}