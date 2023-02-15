package com.alibaba.cloud.integrated.praise.consumer.praise.item;

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
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import top.bettercode.summer.tools.lang.util.StringUtil;

/**
 *  对应数据库表名：item
 */
@DynamicUpdate
@Entity
@Table(name = Item.TABLE_NAME)
@EntityListeners(AuditingEntityListener.class)
public class Item implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 对应数据库表名
   */
  public static final String TABLE_NAME = "item";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "praise")
  private Integer praise;

  @Column(name = "create_time")
  private LocalDateTime createTime;

  @Column(name = "update_time")
  private LocalDateTime updateTime;

  public Item() {
  }

  public Item(Long id) {
    this.id = id;
  }

  /**
   * 如果属性为null，根据参数对象的属性设置值
   *
   * @param exist 已存在实体
   */
  public Item nullPropertySetFrom(Item exist) {
    if (this.id == null) {
      this.id = exist.getId();
    }
    if (this.praise == null) {
      this.praise = exist.getPraise();
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
  public Item propertySetFrom(Object form) {
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
  public Item setId(Long id) {
    this.id = id;
    return this;
  }

  public Integer getPraise() {
    return praise;
  }

  /**
   * 
   * @return 实例
   */
  public Item setPraise(Integer praise) {
    this.praise = praise;
    return this;
  }

  public LocalDateTime getCreateTime() {
    return createTime;
  }

  /**
   * 
   * @return 实例
   */
  public Item setCreateTime(LocalDateTime createTime) {
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
  public Item setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Item)) {
      return false;
    }
    Item that = (Item) o;
    if (!Objects.equals(id, that.getId())) {
      return false;
    }
    return Objects.equals(praise, that.praise) &&
        Objects.equals(createTime, that.createTime) &&
        Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, praise, createTime, updateTime);
  }

  @Override
  public String toString() {
    return StringUtil.json(this);
  }
}