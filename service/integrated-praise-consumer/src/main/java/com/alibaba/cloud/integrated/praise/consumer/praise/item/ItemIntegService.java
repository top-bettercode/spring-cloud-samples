package com.alibaba.cloud.integrated.praise.consumer.praise.item;

import java.sql.Timestamp;
import org.springframework.stereotype.Service;
import top.bettercode.summer.data.jpa.BaseService;

/**
 *  服务层实现
 */
@Service
public class ItemIntegService extends BaseService<Item, Long, ItemIntegRepository> {


  public ItemIntegService(ItemIntegRepository repository) {
    super(repository);
  }


  public void praiseItem(Integer itemId) {
    Timestamp updateTime = new Timestamp(System.currentTimeMillis());
    repository.praiseItem(itemId, updateTime);
  }

  public int getPraise(Integer itemId) {
    return repository.getPraise(itemId);
  }

}