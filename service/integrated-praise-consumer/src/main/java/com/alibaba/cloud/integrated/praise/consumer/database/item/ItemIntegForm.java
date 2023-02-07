package com.alibaba.cloud.integrated.praise.consumer.database.item;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import top.bettercode.summer.web.validator.UpdateConstraint;

/**
 *  表单
 */
public class ItemIntegForm {

  @JsonIgnore
  private final Item entity;

  public ItemIntegForm() {
    this.entity = new Item();
  }

  public ItemIntegForm(Item item) {
    this.entity = item;
  }

  public ItemIntegForm(Long id) {
    this.entity = new Item(id);
  }

  public Item getEntity() {
    return entity;
  }

  @NotNull(groups = UpdateConstraint.class)
  public Long getId() {
    return this.entity.getId();
  }

  public void setId(Long id) {
    this.entity.setId(id);
  }

  public Integer getPraise() {
    return this.entity.getPraise();
  }

  public void setPraise(Integer praise) {
    this.entity.setPraise(praise);
  }

  public LocalDateTime getCreateTime() {
    return this.entity.getCreateTime();
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.entity.setCreateTime(createTime);
  }

  public LocalDateTime getUpdateTime() {
    return this.entity.getUpdateTime();
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.entity.setUpdateTime(updateTime);
  }
}