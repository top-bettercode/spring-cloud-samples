package com.alibaba.cloud.integrated.order.database.order;

public interface OrderProperties {

  String id = "id";
  String userId = "userId";
  String commodityCode = "commodityCode";
  String count = "count";
  /**
   *  默认值：0
   */
  String money = "money";
  String createTime = "createTime";
  String updateTime = "updateTime";
}