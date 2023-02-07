package com.alibaba.cloud.integrated.storage.database.storage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import org.hibernate.validator.constraints.Length;
import top.bettercode.summer.web.validator.UpdateConstraint;

/**
 *  表单
 */
public class StorageIntegForm {

  @JsonIgnore
  private final Storage entity;

  public StorageIntegForm() {
    this.entity = new Storage();
  }

  public StorageIntegForm(Storage storage) {
    this.entity = storage;
  }

  public StorageIntegForm(Long id) {
    this.entity = new Storage(id);
  }

  public Storage getEntity() {
    return entity;
  }

  @NotNull(groups = UpdateConstraint.class)
  public Long getId() {
    return this.entity.getId();
  }

  public void setId(Long id) {
    this.entity.setId(id);
  }

  @Length(max = 255, groups = Default.class)
  public String getCommodityCode() {
    return this.entity.getCommodityCode();
  }

  public void setCommodityCode(String commodityCode) {
    this.entity.setCommodityCode(commodityCode);
  }

  public Integer getCount() {
    return this.entity.getCount();
  }

  public void setCount(Integer count) {
    this.entity.setCount(count);
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