package com.alibaba.cloud.integrated.storage.database.storage;

import com.alibaba.cloud.integrated.storage.support.IntegController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.bettercode.summer.web.RespEntity;
import top.bettercode.summer.web.exception.BusinessException;

/**
 * 接口
 */
@ConditionalOnWebApplication
@Validated
@RestController
@RequestMapping(value = "/storage", name = "")
public class StorageIntegController extends IntegController {

  private final StorageIntegService storageIntegService;

  public StorageIntegController(StorageIntegService storageIntegService) {
    this.storageIntegService = storageIntegService;
  }

  @PostMapping("/reduce-stock")
  public RespEntity<?> reduceStock(@RequestBody StorageDTO storageDTO) {
    try {
      storageIntegService.reduceStock(storageDTO.getCommodityCode(),
          storageDTO.getCount());
    } catch (BusinessException e) {
      return RespEntity.fail(e.getMessage());
    }
    return RespEntity.ok("");
  }

  @GetMapping("/")
  public RespEntity<?> getRemainCount(String commodityCode) {
    return storageIntegService.getRemainCount(commodityCode);
  }


}