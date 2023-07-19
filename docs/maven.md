# maven


## 元素

### `dependencyManagemnent`: 依赖管理
+ 该元素下声明的依赖不会实际引入到模块中，只在`<dependencies>`元素下同样声明了该依赖，才会引入到模块中
+ 该元素能够约束`<dependencies>`下依赖的使用，即 `<dependencies 声明的依赖若未指定版本，则使用 dependencyManagement 中指定的版本，否则将覆盖 dependencyManagement 中的版本

### `scope`
+ `provided`表明该包只在编译和测试的时候使用