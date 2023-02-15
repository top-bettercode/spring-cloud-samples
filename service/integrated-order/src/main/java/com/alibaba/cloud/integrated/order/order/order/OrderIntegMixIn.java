package com.alibaba.cloud.integrated.order.order.order;

import com.alibaba.cloud.integrated.order.web.IntegSerializationViews;
import com.fasterxml.jackson.annotation.JsonView;
import top.bettercode.summer.web.serializer.MixIn;

/**
 * 
 */
public interface OrderIntegMixIn extends MixIn<Order>, OrderMethodInfo, IntegSerializationViews {

  /**
   * 主键
   */
  @JsonView(Object.class)
  @Override
  Long getId();
}