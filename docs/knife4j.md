# knife4j

+ `@ApiOperation`
    + value: api操作的简短描述
    + notes：api操作的详细描述
    + tags： api操作的标签
+ `@ApiParam` ：描述API操作的参数，通常用于标注在Controller类的方法的参数上
  + name：参数名称
  + value；参数描述
  + required：指示参数是否是必须的
  + defaultValue：参数的默认值
  + allowableValue：允许的参数值范围
+ `@ApiModel`：描述一个API操作返回的数据模型
  + value：模型名称
  + description：模型描述
