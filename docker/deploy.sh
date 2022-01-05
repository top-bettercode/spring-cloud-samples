#!/bin/sh

read -p "请输入数据库url(示例：10.0.60.184:3306/bot): " param
cat  docker-compose.yml.template |sed "s/mysql.xxx:3306\/bot/${param//\//\\/}/g" > docker-compose.yml

read -p "请输入数据库用户名: " param
sed -i "s/mysqlusername/${param}/g" docker-compose.yml

read -p "请输入数据库密码: " param
sed -i "s/mysqlpassword/${param}/g" docker-compose.yml

read -p "请输入服务外网访问IP或域名(示例：10.0.60.184): " param
sed -i "s/admin.xxx/${param}/g" docker-compose.yml

read -p "请输入设备检测主机地址(示例：10.0.60.184:8088): " param
sed -i "s/video-url:8088/${param}/g" docker-compose.yml

read -p "请输入上传文件保存路径: " param
sed -i "s/.\/data\/file/${param//\//\\/}/g" docker-compose.yml

read -p "请输入日志保存路径: " param
sed -i "s/.\/data\/logs/${param//\//\\/}/g" docker-compose.yml

sudo docker-compose build
sudo docker-compose up -d
