package com.alibaba.cloud.integrated.order.database.order;

import java.time.LocalDateTime;
import top.bettercode.summer.data.jpa.query.PathMatcher;
import top.bettercode.summer.data.jpa.query.SpecMatcher;
import top.bettercode.summer.data.jpa.query.SpecMatcherMode;
import top.bettercode.summer.data.jpa.query.SpecPath;

/**
 *  SpecMatcher
 */
public class OrderMatcher extends SpecMatcher<Order, OrderMatcher> {

  private static final long serialVersionUID = 1L;

  private OrderMatcher(SpecMatcherMode mode, Order probe) {
    super(mode, probe);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static OrderMatcher matching() {
    return new OrderMatcher(SpecMatcherMode.ALL, null);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static OrderMatcher matching(Order probe) {
    return new OrderMatcher(SpecMatcherMode.ALL, probe);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static OrderMatcher matchingAny() {
    return new OrderMatcher(SpecMatcherMode.ANY, null);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static OrderMatcher matchingAny(Order probe) {
    return new OrderMatcher(SpecMatcherMode.ANY, probe);
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Order, OrderMatcher> id() {
    return super.specPath("id");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public OrderMatcher id(Long id) {
    super.specPath("id").setValue(id);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public OrderMatcher id(Long id, PathMatcher matcher) {
    super.specPath("id").setValue(id).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Order, OrderMatcher> userId() {
    return super.specPath("userId");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public OrderMatcher userId(String userId) {
    super.specPath("userId").setValue(userId);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public OrderMatcher userId(String userId, PathMatcher matcher) {
    super.specPath("userId").setValue(userId).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Order, OrderMatcher> commodityCode() {
    return super.specPath("commodityCode");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public OrderMatcher commodityCode(String commodityCode) {
    super.specPath("commodityCode").setValue(commodityCode);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public OrderMatcher commodityCode(String commodityCode, PathMatcher matcher) {
    super.specPath("commodityCode").setValue(commodityCode).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Order, OrderMatcher> count() {
    return super.specPath("count");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public OrderMatcher count(Integer count) {
    super.specPath("count").setValue(count);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public OrderMatcher count(Integer count, PathMatcher matcher) {
    super.specPath("count").setValue(count).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Order, OrderMatcher> money() {
    return super.specPath("money");
  }

  /**
   * @param money  默认值：0
   * @return  相关Matcher
   */
  public OrderMatcher money(Integer money) {
    super.specPath("money").setValue(money);
    return this;
  }

  /**
   * @param money  默认值：0
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public OrderMatcher money(Integer money, PathMatcher matcher) {
    super.specPath("money").setValue(money).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Order, OrderMatcher> createTime() {
    return super.specPath("createTime");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public OrderMatcher createTime(LocalDateTime createTime) {
    super.specPath("createTime").setValue(createTime);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public OrderMatcher createTime(LocalDateTime createTime, PathMatcher matcher) {
    super.specPath("createTime").setValue(createTime).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Order, OrderMatcher> updateTime() {
    return super.specPath("updateTime");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public OrderMatcher updateTime(LocalDateTime updateTime) {
    super.specPath("updateTime").setValue(updateTime);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public OrderMatcher updateTime(LocalDateTime updateTime, PathMatcher matcher) {
    super.specPath("updateTime").setValue(updateTime).withMatcher(matcher);
    return this;
  }
}