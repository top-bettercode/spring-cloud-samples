package com.alibaba.cloud.integrated.storage.database.storage;

import java.time.LocalDateTime;

/**
 * 
 */
public interface StorageMethodInfo {

  Long getId();

  String getCommodityCode();

  /**
   * @return  默认值：0
   */
  Integer getCount();

  LocalDateTime getCreateTime();

  LocalDateTime getUpdateTime();
}