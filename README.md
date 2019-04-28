## bi-parent v2.0 基础构建  

Web应用基础框架，适合在此基础上直接构建业务项目，减少重复造轮子

> jdk 1.8  
> author: owen jia  
> sping-boot 2.0.5 基础上构建  
> maven 包管理工具  

## 模块介绍

1. bi-parent 父集  
集中管理jar  

2. bi-web 启动&打包service   
Controller控制层逻辑和全局拦截器

3. bi-data-service 数据业务层   
数据查询逻辑、业务执行逻辑、基础工具；  
mybatis-generator集成在test目录下，执行命令： mvn mybatis-generator:generate  

4. bi-dubbo-api dubbo接口集  
演示dubbo api，实际工作引入自己的api包

5. biguava-spring-boot-starter 自动配置sample

## 技术集

* spring-boot
* mybatis
* mybatis-generator-maven-plugin
* mysql
* druid
* pagehelper
* mybatis-mapper
* spring framework: mvc & common
* dubbo-spring-boot-starter

## 文档链接

1. spring-boot 2.0.5 文档地址：   
https://docs.spring.io/spring-boot/docs/2.0.5.RELEASE/reference/htmlsingle/  

2. dubbo-spring-boot-starter 2.0.0 文档地址：  
https://github.com/owen-jia/dubbo-spring-boot-starter


