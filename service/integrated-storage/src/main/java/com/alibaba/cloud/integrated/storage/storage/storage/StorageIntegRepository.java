package com.alibaba.cloud.integrated.storage.storage.storage;

import java.sql.Timestamp;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.bettercode.summer.data.jpa.BaseRepository;

/**
 * 数据层
 */
public interface StorageIntegRepository extends BaseRepository<Storage, Long> {


  @Select("SELECT `count` FROM storage WHERE commodity_code = #{commodityCode}")
  Integer getStock(String commodityCode);

  @Update("UPDATE storage SET count = count - #{count},update_time=#{updateTime} WHERE commodity_code = #{commodityCode}")
  int reduceStock(String commodityCode, Integer count, Timestamp updateTime);

}