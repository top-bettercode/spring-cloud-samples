package com.alibaba.cloud.integrated.storage.database.storage;

import io.seata.core.context.RootContext;
import java.sql.Timestamp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.bettercode.summer.data.jpa.BaseService;
import top.bettercode.summer.web.RespEntity;
import top.bettercode.summer.web.exception.BusinessException;

/**
 *  服务层实现
 */
@Service
public class StorageIntegService extends BaseService<Storage, Long, StorageIntegRepository> {


  public StorageIntegService(StorageIntegRepository repository) {
    super(repository);
  }


  @Transactional
  public void reduceStock(String commodityCode, Integer count)
      throws BusinessException {
    log.info("[reduceStock] current XID: {}", RootContext.getXID());

    checkStock(commodityCode, count);

    Timestamp updateTime = new Timestamp(System.currentTimeMillis());
    int updateCount = repository.reduceStock(commodityCode, count, updateTime);
    if (updateCount == 0) {
      throw new BusinessException("deduct stock failed");
    }
  }

  public RespEntity<?> getRemainCount(String commodityCode) {
    Integer stock = repository.getStock(commodityCode);
    if (stock == null) {
      return RespEntity.fail("commodityCode wrong,please check commodity code");
    }
    return RespEntity.ok(stock);
  }

  private void checkStock(String commodityCode, Integer count)
      throws BusinessException {
    Integer stock = repository.getStock(commodityCode);
    if (stock < count) {
      throw new BusinessException("no enough stock");
    }
  }

}