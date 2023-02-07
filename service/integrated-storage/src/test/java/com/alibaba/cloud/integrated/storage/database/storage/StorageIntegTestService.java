package com.alibaba.cloud.integrated.storage.database.storage;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Service;

/**
 *  测试服务层
 */
@ConditionalOnWebApplication
@Service
public class StorageIntegTestService {

  @Autowired
  private StorageIntegService storageIntegService;

  public Storage insertStorage() {
    Storage storage = new Storage();
    storage.setCommodityCode("");
    storage.setCreateTime(LocalDateTime.now());
    storage.setUpdateTime(LocalDateTime.now());
    storage.nullPropertySetWithDefaults();
    storageIntegService.save(storage);
    System.err.println("------------------------------------------------------");
    return storage;
  }
}