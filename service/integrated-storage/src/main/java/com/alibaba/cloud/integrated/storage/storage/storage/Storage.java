package com.alibaba.cloud.integrated.storage.storage.storage;

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
 *  对应数据库表名：storage
 */
@DynamicUpdate
@Entity
@Table(name = Storage.TABLE_NAME)
@EntityListeners(AuditingEntityListener.class)
public class Storage implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 对应数据库表名
   */
  public static final String TABLE_NAME = "storage";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "commodity_code")
  private String commodityCode;

  /**
   *  默认值：0
   */
  @ColumnDefault("0")
  @Column(name = "count")
  private Integer count;

  @Column(name = "create_time")
  private LocalDateTime createTime;

  @Column(name = "update_time")
  private LocalDateTime updateTime;

  public Storage() {
  }

  public Storage(Long id) {
    this.id = id;
  }

  /**
   * @return 带默认值实例
   */
  public static Storage withDefaults() {
    Storage storage = new Storage();
    storage.setCount(0);
    return storage;
  }

  /**
   * 如果属性为null，设置默认值
   */
  public Storage nullPropertySetWithDefaults() {
    if (this.count == null) {
      this.count = 0;
    }
    return this;
  }

  /**
   * 如果属性为null，根据参数对象的属性设置值
   *
   * @param exist 已存在实体
   */
  public Storage nullPropertySetFrom(Storage exist) {
    if (this.id == null) {
      this.id = exist.getId();
    }
    if (this.commodityCode == null) {
      this.commodityCode = exist.getCommodityCode();
    }
    if (this.count == null) {
      this.count = exist.getCount();
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
  public Storage propertySetFrom(Object form) {
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
  public Storage setId(Long id) {
    this.id = id;
    return this;
  }

  public String getCommodityCode() {
    return commodityCode;
  }

  /**
   * 
   * @return 实例
   */
  public Storage setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

  /**
   * @return  默认值：0
   */
  public Integer getCount() {
    return count;
  }

  /**
   * @param count  默认值：0
   * @return 实例
   */
  public Storage setCount(Integer count) {
    this.count = count;
    return this;
  }

  public LocalDateTime getCreateTime() {
    return createTime;
  }

  /**
   * 
   * @return 实例
   */
  public Storage setCreateTime(LocalDateTime createTime) {
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
  public Storage setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Storage)) {
      return false;
    }
    Storage that = (Storage) o;
    if (!Objects.equals(id, that.getId())) {
      return false;
    }
    return Objects.equals(commodityCode, that.commodityCode) &&
        Objects.equals(count, that.count) &&
        Objects.equals(createTime, that.createTime) &&
        Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, commodityCode, count, createTime, updateTime);
  }

  @Override
  public String toString() {
    return StringUtil.json(this);
  }
}