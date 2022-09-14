# xxd-frame
一个统一规范的脚手架
* 依赖统一管理
* 模块统一管理
* 项目模板，快速创建
* 通用功能模块封装

# 安装
```shell
mvn clean install
```

# 根据模板创建工程
示例：  
```shell
mvn archetype:generate -DgroupId=com.test -DartifactId=archetype.demo -DarchetypeGroupId=com.xxd -DarchetypeArtifactId=xxd-frame-archetype -DarchetypeVersion:1.0.0
```