package com.alibaba.cloud.integrated.praise.consumer.praise.item;

import java.time.LocalDateTime;
import top.bettercode.summer.data.jpa.query.PathMatcher;
import top.bettercode.summer.data.jpa.query.SpecMatcher;
import top.bettercode.summer.data.jpa.query.SpecMatcherMode;
import top.bettercode.summer.data.jpa.query.SpecPath;

/**
 *  SpecMatcher
 */
public class ItemMatcher extends SpecMatcher<Item, ItemMatcher> {

  private static final long serialVersionUID = 1L;

  private ItemMatcher(SpecMatcherMode mode, Item probe) {
    super(mode, probe);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static ItemMatcher matching() {
    return new ItemMatcher(SpecMatcherMode.ALL, null);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static ItemMatcher matching(Item probe) {
    return new ItemMatcher(SpecMatcherMode.ALL, probe);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static ItemMatcher matchingAny() {
    return new ItemMatcher(SpecMatcherMode.ANY, null);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static ItemMatcher matchingAny(Item probe) {
    return new ItemMatcher(SpecMatcherMode.ANY, probe);
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Item, ItemMatcher> id() {
    return super.specPath("id");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public ItemMatcher id(Long id) {
    super.specPath("id").setValue(id);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public ItemMatcher id(Long id, PathMatcher matcher) {
    super.specPath("id").setValue(id).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Item, ItemMatcher> praise() {
    return super.specPath("praise");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public ItemMatcher praise(Integer praise) {
    super.specPath("praise").setValue(praise);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public ItemMatcher praise(Integer praise, PathMatcher matcher) {
    super.specPath("praise").setValue(praise).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Item, ItemMatcher> createTime() {
    return super.specPath("createTime");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public ItemMatcher createTime(LocalDateTime createTime) {
    super.specPath("createTime").setValue(createTime);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public ItemMatcher createTime(LocalDateTime createTime, PathMatcher matcher) {
    super.specPath("createTime").setValue(createTime).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Item, ItemMatcher> updateTime() {
    return super.specPath("updateTime");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public ItemMatcher updateTime(LocalDateTime updateTime) {
    super.specPath("updateTime").setValue(updateTime);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public ItemMatcher updateTime(LocalDateTime updateTime, PathMatcher matcher) {
    super.specPath("updateTime").setValue(updateTime).withMatcher(matcher);
    return this;
  }
}