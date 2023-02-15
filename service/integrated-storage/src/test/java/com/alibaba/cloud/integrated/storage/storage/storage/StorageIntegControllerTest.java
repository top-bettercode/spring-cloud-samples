package com.alibaba.cloud.integrated.storage.storage.storage;

import com.alibaba.cloud.integrated.storage.support.BaseWebTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *  控制层测试
 */
@DisplayName("")
@Transactional
@TestMethodOrder(OrderAnnotation.class)
public class StorageIntegControllerTest extends BaseWebTest {

  @Autowired
  private StorageIntegService storageIntegService;

  @Autowired
  private StorageIntegTestService storageIntegTestService;

  @Override
  public void beforeEach() throws Exception {
    tableNames(Storage.TABLE_NAME);
  }

}