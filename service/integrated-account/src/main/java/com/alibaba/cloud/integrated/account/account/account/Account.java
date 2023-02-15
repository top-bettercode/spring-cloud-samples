package com.alibaba.cloud.integrated.account.account.account;

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
 *  对应数据库表名：account
 */
@DynamicUpdate
@Entity
@Table(name = Account.TABLE_NAME)
@EntityListeners(AuditingEntityListener.class)
public class Account implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 对应数据库表名
   */
  public static final String TABLE_NAME = "account";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  /**
   * user_id
   */
  @Column(name = "user_id")
  private String userId;

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

  public Account() {
  }

  public Account(Long id) {
    this.id = id;
  }

  /**
   * @return 带默认值实例
   */
  public static Account withDefaults() {
    Account account = new Account();
    account.setMoney(0);
    return account;
  }

  /**
   * 如果属性为null，设置默认值
   */
  public Account nullPropertySetWithDefaults() {
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
  public Account nullPropertySetFrom(Account exist) {
    if (this.id == null) {
      this.id = exist.getId();
    }
    if (this.userId == null) {
      this.userId = exist.getUserId();
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
  public Account propertySetFrom(Object form) {
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
  public Account setId(Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return user_id
   */
  public String getUserId() {
    return userId;
  }

  /**
   * @param userId user_id
   * @return 实例
   */
  public Account setUserId(String userId) {
    this.userId = userId;
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
  public Account setMoney(Integer money) {
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
  public Account setCreateTime(LocalDateTime createTime) {
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
  public Account setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Account)) {
      return false;
    }
    Account that = (Account) o;
    if (!Objects.equals(id, that.getId())) {
      return false;
    }
    return Objects.equals(userId, that.userId) &&
        Objects.equals(money, that.money) &&
        Objects.equals(createTime, that.createTime) &&
        Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, money, createTime, updateTime);
  }

  @Override
  public String toString() {
    return StringUtil.json(this);
  }
}