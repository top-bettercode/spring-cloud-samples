package com.alibaba.cloud.integrated.order.database.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import org.hibernate.validator.constraints.Length;
import top.bettercode.summer.web.validator.UpdateConstraint;

/**
 *  表单
 */
public class OrderIntegForm {

  @JsonIgnore
  private final Order entity;

  public OrderIntegForm() {
    this.entity = new Order();
  }

  public OrderIntegForm(Order order) {
    this.entity = order;
  }

  public OrderIntegForm(Long id) {
    this.entity = new Order(id);
  }

  public Order getEntity() {
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
  public String getUserId() {
    return this.entity.getUserId();
  }

  public void setUserId(String userId) {
    this.entity.setUserId(userId);
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

  public Integer getMoney() {
    return this.entity.getMoney();
  }

  public void setMoney(Integer money) {
    this.entity.setMoney(money);
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