FROM openjdk:8u212-jre-alpine3.9
LABEL maintainer=PeterWu<piterwu@outlook.com>
ENV TZ Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN echo -e "https://mirror.tuna.tsinghua.edu.cn/alpine/v3.9/main\nhttps://mirror.tuna.tsinghua.edu.cn/alpine/v3.9/community" > /etc/apk/repositories
RUN apk --update add curl bash ttf-dejavu && \
      rm -rf /var/cache/apk/*
WORKDIR /app
