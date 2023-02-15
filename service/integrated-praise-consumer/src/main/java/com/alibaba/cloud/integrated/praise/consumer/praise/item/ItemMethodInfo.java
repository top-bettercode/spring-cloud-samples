package com.alibaba.cloud.integrated.praise.consumer.praise.item;

import java.time.LocalDateTime;

/**
 * 
 */
public interface ItemMethodInfo {

  Long getId();

  Integer getPraise();

  LocalDateTime getCreateTime();

  LocalDateTime getUpdateTime();
}