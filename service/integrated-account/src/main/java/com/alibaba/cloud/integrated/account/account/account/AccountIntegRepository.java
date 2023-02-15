package com.alibaba.cloud.integrated.account.account.account;

import java.sql.Timestamp;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.bettercode.summer.data.jpa.BaseRepository;

/**
 * 数据层
 */
public interface AccountIntegRepository extends BaseRepository<Account, Long> {


  @Select("SELECT money FROM account WHERE user_id = #{userId}")
  Integer getBalance(String userId);

  @Update("UPDATE account SET money = money - #{price},update_time = #{updateTime} WHERE user_id = #{userId} AND money >= ${price}")
  int reduceBalance(String userId, Integer price, Timestamp updateTime);


}