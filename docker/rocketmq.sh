#!/usr/bin/env bash

#https://hub.docker.com/r/foxiswho/rocketmq/#!

docker run -d \
      --name rmqnamesrv \
      -e "JAVA_OPT_EXT=-Xms512M -Xmx512M -Xmn128m" \
      -p 9876:9876 \
      foxiswho/rocketmq:4.8.0 \
      sh mqnamesrv

#docker run -d \
#      --name rmqnamesrv \
#      -e "JAVA_OPT_EXT=-Xms512M -Xmx512M -Xmn128m" \
#      -p 9876:9876 \
#      foxiswho/rocketmq:4.8.0 \
#      sh mqbroker -c /home/rocketmq/conf/broker.conf