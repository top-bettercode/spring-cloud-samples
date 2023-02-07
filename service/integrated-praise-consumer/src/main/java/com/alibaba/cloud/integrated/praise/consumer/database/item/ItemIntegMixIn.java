package com.alibaba.cloud.integrated.praise.consumer.database.item;

import com.alibaba.cloud.integrated.praise.consumer.web.IntegSerializationViews;
import com.fasterxml.jackson.annotation.JsonView;
import top.bettercode.summer.web.serializer.MixIn;

/**
 * 
 */
public interface ItemIntegMixIn extends MixIn<Item>, ItemMethodInfo, IntegSerializationViews {

  /**
   * 主键
   */
  @JsonView(Object.class)
  @Override
  Long getId();
}