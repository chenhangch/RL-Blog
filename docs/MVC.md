# MVC
## 三层架构

三层架构是为了符合”高内聚、低耦合“思想，把各个功能模块分为表示层（UI）、业务逻辑层（BLL）和数据访问层（DAL）

+ UI层：实现用户的界面功能，即数据的输入和输出
+ BLL层：针对具体的问题的操作，可以理解为对数据层的操作，对数据业务的逻辑处理
+ DAL层：也就是持久层，主要功能是对原始数据进行curd（增删改查）操作，为UI或者BLL层提供数据

`view` -> `service` -> `dao` -> `数据库[Mysql]`

## MVC架构
全称Model View Controller，是一种软件设计典范
+ 视图（view）：为用户提供使用界面，与用户直接进行交互
+ 模型（model）：表示一个存取数据的对象或者JAVA POJO（Plain Old Java Object，简单java对象）
    模型分为两类：数据承载Bean（实体类：User类等）、业务处理Bean（Service或Dao对象）
+ 控制层（controller）：用于将用户请求转发给相应的Model处理，他使得视图与模型分离

> editTime: 2023/07/18