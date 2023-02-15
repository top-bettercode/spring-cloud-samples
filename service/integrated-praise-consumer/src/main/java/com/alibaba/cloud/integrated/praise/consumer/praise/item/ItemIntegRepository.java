package com.alibaba.cloud.integrated.praise.consumer.praise.item;

import java.sql.Timestamp;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.bettercode.summer.data.jpa.BaseRepository;

/**
 * 数据层
 */
public interface ItemIntegRepository extends BaseRepository<Item, Long> {

  @Update("update item set praise = praise+1,update_time=#{updateTime} where id = #{itemId}")
  int praiseItem(Integer itemId,
      Timestamp updateTime);

  @Select("select praise from item where id = #{itemId}")
  int getPraise(Integer itemId);

}