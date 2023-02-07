package com.alibaba.cloud.integrated.account.database.account;

import java.time.LocalDateTime;
import top.bettercode.summer.data.jpa.query.PathMatcher;
import top.bettercode.summer.data.jpa.query.SpecMatcher;
import top.bettercode.summer.data.jpa.query.SpecMatcherMode;
import top.bettercode.summer.data.jpa.query.SpecPath;

/**
 *  SpecMatcher
 */
public class AccountMatcher extends SpecMatcher<Account, AccountMatcher> {

  private static final long serialVersionUID = 1L;

  private AccountMatcher(SpecMatcherMode mode, Account probe) {
    super(mode, probe);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static AccountMatcher matching() {
    return new AccountMatcher(SpecMatcherMode.ALL, null);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static AccountMatcher matching(Account probe) {
    return new AccountMatcher(SpecMatcherMode.ALL, probe);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static AccountMatcher matchingAny() {
    return new AccountMatcher(SpecMatcherMode.ANY, null);
  }

  /**
   * 创建 SpecMatcher 实例
   *
   * @return  SpecMatcher 实例
   */
  public static AccountMatcher matchingAny(Account probe) {
    return new AccountMatcher(SpecMatcherMode.ANY, probe);
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Account, AccountMatcher> id() {
    return super.specPath("id");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public AccountMatcher id(Long id) {
    super.specPath("id").setValue(id);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public AccountMatcher id(Long id, PathMatcher matcher) {
    super.specPath("id").setValue(id).withMatcher(matcher);
    return this;
  }

  /**
   * @return user_id 相关Matcher
   */
  public SpecPath<Account, AccountMatcher> userId() {
    return super.specPath("userId");
  }

  /**
   * @param userId user_id
   * @return user_id 相关Matcher
   */
  public AccountMatcher userId(String userId) {
    super.specPath("userId").setValue(userId);
    return this;
  }

  /**
   * @param userId user_id
   * @param matcher PathMatcher
   * @return user_id 相关Matcher
   */
  public AccountMatcher userId(String userId, PathMatcher matcher) {
    super.specPath("userId").setValue(userId).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Account, AccountMatcher> money() {
    return super.specPath("money");
  }

  /**
   * @param money  默认值：0
   * @return  相关Matcher
   */
  public AccountMatcher money(Integer money) {
    super.specPath("money").setValue(money);
    return this;
  }

  /**
   * @param money  默认值：0
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public AccountMatcher money(Integer money, PathMatcher matcher) {
    super.specPath("money").setValue(money).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Account, AccountMatcher> createTime() {
    return super.specPath("createTime");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public AccountMatcher createTime(LocalDateTime createTime) {
    super.specPath("createTime").setValue(createTime);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public AccountMatcher createTime(LocalDateTime createTime, PathMatcher matcher) {
    super.specPath("createTime").setValue(createTime).withMatcher(matcher);
    return this;
  }

  /**
   * @return  相关Matcher
   */
  public SpecPath<Account, AccountMatcher> updateTime() {
    return super.specPath("updateTime");
  }

  /**
   * 
   * @return  相关Matcher
   */
  public AccountMatcher updateTime(LocalDateTime updateTime) {
    super.specPath("updateTime").setValue(updateTime);
    return this;
  }

  /**
   * 
   * @param matcher PathMatcher
   * @return  相关Matcher
   */
  public AccountMatcher updateTime(LocalDateTime updateTime, PathMatcher matcher) {
    super.specPath("updateTime").setValue(updateTime).withMatcher(matcher);
    return this;
  }
}