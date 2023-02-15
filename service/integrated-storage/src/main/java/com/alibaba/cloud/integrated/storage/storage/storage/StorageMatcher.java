package com.alibaba.cloud.integrated.storage.storage.storage;

import java.time.LocalDateTime;
import top.bettercode.summer.data.jpa.query.PathMatcher;
import top.bettercode.summer.data.jpa.query.SpecMatcher;
import top.bettercode.summer.data.jpa.query.SpecMatcherMode;
import top.bettercode.summer.data.jpa.query.SpecPath;

/**
 *  SpecMatcher
 */
public class StorageMatcher extends SpecMatcher<Storage, StorageMatcher> {

  private static final long serialVersionUID = 1L;

  private StorageMatcher(SpecMatcherMode mode, Storage probe) {
    super(mode, probe);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static StorageMatcher matching() {
    return new StorageMatcher(SpecMatcherMode.ALL, null);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static StorageMatcher matching(Storage probe) {
    return new StorageMatcher(SpecMatcherMode.ALL, probe);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static StorageMatcher matchingAny() {
    return new StorageMatcher(SpecMatcherMode.ANY, null);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static StorageMatcher matchingAny(Storage probe) {
    return new StorageMatcher(SpecMatcherMode.ANY, probe);
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Storage, StorageMatcher> id() {
    return super.specPath("id");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public StorageMatcher id(Long id) {
    super.specPath("id").setValue(id);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public StorageMatcher id(Long id, PathMatcher matcher) {
    super.specPath("id").setValue(id).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Storage, StorageMatcher> commodityCode() {
    return super.specPath("commodityCode");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public StorageMatcher commodityCode(String commodityCode) {
    super.specPath("commodityCode").setValue(commodityCode);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public StorageMatcher commodityCode(String commodityCode, PathMatcher matcher) {
    super.specPath("commodityCode").setValue(commodityCode).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Storage, StorageMatcher> count() {
    return super.specPath("count");
  }

  /**
   * @param count  默认值：0
   * @return  相关Matcher
   */
  public StorageMatcher count(Integer count) {
    super.specPath("count").setValue(count);
    return this;
  }

  /**
   * @param count  默认值：0
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public StorageMatcher count(Integer count, PathMatcher matcher) {
    super.specPath("count").setValue(count).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Storage, StorageMatcher> createTime() {
    return super.specPath("createTime");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public StorageMatcher createTime(LocalDateTime createTime) {
    super.specPath("createTime").setValue(createTime);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public StorageMatcher createTime(LocalDateTime createTime, PathMatcher matcher) {
    super.specPath("createTime").setValue(createTime).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Storage, StorageMatcher> updateTime() {
    return super.specPath("updateTime");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public StorageMatcher updateTime(LocalDateTime updateTime) {
    super.specPath("updateTime").setValue(updateTime);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public StorageMatcher updateTime(LocalDateTime updateTime, PathMatcher matcher) {
    super.specPath("updateTime").setValue(updateTime).withMatcher(matcher);
    return this;
  }
}