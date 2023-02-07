package com.alibaba.cloud.integrated.storage.database.storage;

import com.alibaba.cloud.integrated.storage.web.IntegSerializationViews;
import com.fasterxml.jackson.annotation.JsonView;
import top.bettercode.summer.web.serializer.MixIn;

/**
 * 
 */
public interface StorageIntegMixIn extends MixIn<Storage>, StorageMethodInfo, IntegSerializationViews {

  /**
   * 主键
   */
  @JsonView(Object.class)
  @Override
  Long getId();
}