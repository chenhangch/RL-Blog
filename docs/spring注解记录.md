# 注解

+ `@Accessors`: 当属性字段生成getter和setter方法时，做一些相关设置
  + `fluent`：默认false，当值为true时，对应字段的getter方法前面没有get，setter没有set
  + `chain`：默认为false，当值为true时，对应字段的setter方法调用后会返回当前对象
  + `prefix`：该属性是一个字符串数组，当该值有值时，表示忽略字段中对应的前缀，生成对应的getter和setter