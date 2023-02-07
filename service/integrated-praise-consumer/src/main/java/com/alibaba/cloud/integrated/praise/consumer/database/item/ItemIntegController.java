package com.alibaba.cloud.integrated.praise.consumer.database.item;

import com.alibaba.cloud.integrated.praise.consumer.support.IntegController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口
 */
@ConditionalOnWebApplication
@Validated
@RestController
@RequestMapping(value = "/item", name = "")
public class ItemIntegController extends IntegController {
  private final ItemIntegService itemIntegService;
  public ItemIntegController(ItemIntegService itemIntegService) {
    this.itemIntegService = itemIntegService;
  }

  @GetMapping("/query")
  public Integer getPraise(Integer itemId) {
    return itemIntegService.getPraise(itemId);
  }

}