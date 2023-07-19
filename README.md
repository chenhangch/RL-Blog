# pai- 社区项目

> 本项目学习自https://github.com/itwanger/paicoding

##  功能：
1. 文章搜索/发布
2. 评论
3. 点赞收藏
4. 关注
5. 个人中心
6. 管理后台
7. 扫码登录
8. 消息通知
9. 专栏

### 尽可能学习并使用到的技术栈：
+ 构建工具：后端（maven、Gradle）、前端（Webpack、Vite）
+ 单元测试：Junit
+ 开发框架：SpringMVC、Spring、SpringBoot
+ Web服务器：Tomcat、Caddy、Nginx
+ 微服务：SpringCloud
+ 数据层：JPA、MyBatis、MyBatis-Plus
+ 模板引擎：thymeleaf
+ 容器：Docker、k8s、Podman
+ 分布式RPC框架：Dubbo
+ 消息队列：Kafka、RocketMQ、RabbitMQ、Pulsar
+ 持续集成：Jenkins、Drone
+ 压力测试：Jmeter
+ 数据库：Mysql
+ 缓存：Redis
+ nosql：MongoDB
+ 对象存储服务：minio
+ 日志：Log4j、Logback、SF4J、Log4j2
+ 搜索引擎：ES
+ 日志收集：ELK、EFK、LPG
+ 大数据：Spark、Hadoop、HBase、Hive、Storm、Flink
+ 分布式应用储层徐协调：Zookeeper
+ token：JWT
+ 诊断工具：arthas
+ 安全框架：Shiro、SpringSecurity
+ 权限框架：Keycloak、Sa-Token
+ JSON处理：fastjson2、jackson、Gson
+ office文档操作：EasyPoi、EasyExcel
+ 文件预览：kkFileView
+ 属性映射：mapStruct
+ java硬件信息库：oshi
+ java连接SSH服务器：ganymed
+ 接口文档：Swagger-ui、Knife4j、SpringDoc、Torna、YApi
+ 任务调度框架：SpringTask、Quartz、PowerJob、XXL-Job
+ Git服务：Gogs
+ 低代码：LowCodeEngine、Yao、Erupt、magic-api
+ API网关：Gateway、Zuul、apisix
+ 数据可视化（BI）：DataEase、MetaBase
+ 项目文档：Hexo、Vuepress
+ 应用监控：SpringBoot Admin、Grafana、SkyWalking、Elastic APM
+ 注解：lombok
+ jdbc连接池：Druid
+ java工具包：hutool、Guava
+ 数据检查：hibernate validatior
+ 代码生成器：Mybatis generator
+ Web自动化测试：selenium
+ HTTP客户端工具：Retrofit
+ 脚手架：sa-plus

## 项目结构

```text
D:.
├─.idea
├─docs
├─pai-api  //
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─github
│      │  │          └─pai
│      │  │              └─api
│      │  └─resources
│      └─test
│          └─java
├─pai-core // 
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─github
│      │  │          └─pai
│      │  │              └─core
│      │  └─resources
│      └─test
│          └─java
├─pai-service // 后端核心代码
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─github
│      │  │          └─pai
│      │  │              └─service
│      │  └─resources
│      └─test
│          └─java
├─pai-ui
│  └─src
│      ├─main
│      │  ├─java
│      │  └─resources
│      └─test
│          └─java
└─pai-web // controller
    └─src
        ├─main
        │  ├─java
        │  │  └─com
        │  │      └─github
        │  │          └─pai
        │  │              └─web
        │  └─resources
        └─test
            └─java

```

> 如遇到错误，请联系我：chen_hang29@outlook.com