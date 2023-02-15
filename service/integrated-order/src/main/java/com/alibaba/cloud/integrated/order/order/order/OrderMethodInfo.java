package com.alibaba.cloud.integrated.order.order.order;

import java.time.LocalDateTime;

/**
 * 
 */
public interface OrderMethodInfo {

  Long getId();

  String getUserId();

  String getCommodityCode();

  Integer getCount();

  /**
   * @return  默认值：0
   */
  Integer getMoney();

  LocalDateTime getCreateTime();

  LocalDateTime getUpdateTime();
}