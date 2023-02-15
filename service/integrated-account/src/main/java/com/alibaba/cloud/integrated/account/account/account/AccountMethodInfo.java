package com.alibaba.cloud.integrated.account.account.account;

import java.time.LocalDateTime;

/**
 * 
 */
public interface AccountMethodInfo {

  Long getId();

  /**
   * @return user_id
   */
  String getUserId();

  /**
   * @return  默认值：0
   */
  Integer getMoney();

  LocalDateTime getCreateTime();

  LocalDateTime getUpdateTime();
}