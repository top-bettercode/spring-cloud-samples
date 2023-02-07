package com.alibaba.cloud.integrated.account.database.account;

import com.alibaba.cloud.integrated.account.web.IntegSerializationViews;
import com.fasterxml.jackson.annotation.JsonView;
import top.bettercode.summer.web.serializer.MixIn;

/**
 * 
 */
public interface AccountIntegMixIn extends MixIn<Account>, AccountMethodInfo, IntegSerializationViews {

  /**
   * 主键
   */
  @JsonView(Object.class)
  @Override
  Long getId();
}