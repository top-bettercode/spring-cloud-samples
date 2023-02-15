package com.alibaba.cloud.integrated.order.order.order;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import top.bettercode.summer.tools.lang.util.StringUtil;

/**
 *  对应数据库表名：order
 */
@DynamicUpdate
@Entity
@Table(name = Order.TABLE_NAME)
@EntityListeners(AuditingEntityListener.class)
public class Order implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 对应数据库表名
   */
  public static final String TABLE_NAME = "order";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_id")
  private String userId;

  @Column(name = "commodity_code")
  private String commodityCode;

  @Column(name = "count")
  private Integer count;

  /**
   *  默认值：0
   */
  @ColumnDefault("0")
  @Column(name = "money")
  private Integer money;

  @Column(name = "create_time")
  private LocalDateTime createTime;

  @Column(name = "update_time")
  private LocalDateTime updateTime;

  public Order() {
  }

  public Order(Long id) {
    this.id = id;
  }

  /**
   * @return 带默认值实例
   */
  public static Order withDefaults() {
    Order order = new Order();
    order.setMoney(0);
    return order;
  }

  /**
   * 如果属性为null，设置默认值
   */
  public Order nullPropertySetWithDefaults() {
    if (this.money == null) {
      this.money = 0;
    }
    return this;
  }

  /**
   * 如果属性为null，根据参数对象的属性设置值
   *
   * @param exist 已存在实体
   */
  public Order nullPropertySetFrom(Order exist) {
    if (this.id == null) {
      this.id = exist.getId();
    }
    if (this.userId == null) {
      this.userId = exist.getUserId();
    }
    if (this.commodityCode == null) {
      this.commodityCode = exist.getCommodityCode();
    }
    if (this.count == null) {
      this.count = exist.getCount();
    }
    if (this.money == null) {
      this.money = exist.getMoney();
    }
    if (this.createTime == null) {
      this.createTime = exist.getCreateTime();
    }
    if (this.updateTime == null) {
      this.updateTime = exist.getUpdateTime();
    }
    return this;
  }

  /**
   * 从form表单对象更新实体属性
   */
  public Order propertySetFrom(Object form) {
    BeanUtils.copyProperties(form, this);
    return this;
  }

  /**
   * 主键
   */
  public Long getId() {
    return id;
  }

  /**
   * 设置主键
   *
   * @param id 主键
   * @return 实例
   */
  public Order setId(Long id) {
    this.id = id;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  /**
   * 
   * @return 实例
   */
  public Order setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getCommodityCode() {
    return commodityCode;
  }

  /**
   * 
   * @return 实例
   */
  public Order setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

  public Integer getCount() {
    return count;
  }

  /**
   * 
   * @return 实例
   */
  public Order setCount(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * @return  默认值：0
   */
  public Integer getMoney() {
    return money;
  }

  /**
   * @param money  默认值：0
   * @return 实例
   */
  public Order setMoney(Integer money) {
    this.money = money;
    return this;
  }

  public LocalDateTime getCreateTime() {
    return createTime;
  }

  /**
   * 
   * @return 实例
   */
  public Order setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  public LocalDateTime getUpdateTime() {
    return updateTime;
  }

  /**
   * 
   * @return 实例
   */
  public Order setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Order)) {
      return false;
    }
    Order that = (Order) o;
    if (!Objects.equals(id, that.getId())) {
      return false;
    }
    return Objects.equals(userId, that.userId) &&
        Objects.equals(commodityCode, that.commodityCode) &&
        Objects.equals(count, that.count) &&
        Objects.equals(money, that.money) &&
        Objects.equals(createTime, that.createTime) &&
        Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, commodityCode, count, money, createTime, updateTime);
  }

  @Override
  public String toString() {
    return StringUtil.json(this);
  }
}