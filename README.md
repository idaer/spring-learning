# Spring 学习指南

---

## spring-tutorial URL

https://dunwu.github.io/spring-tutorial/#%E7%BB%BC%E5%90%88





## 项目一：Hello World！

步骤1. 创建项目

步骤2.通过maven向项目内添加spring-context的jar包**(pom.xml)**

步骤3.写代码

3.1通过IOC（控制反转/xml文件配置）实现hello world

3.2通过DI（依赖注入/注释）实现hello world

**注意：**spring默认关闭DI，开启DI通过在xml里面插入一个标签

~~~ xml
<context:annotation-config/>
~~~

## 项目二： 通过AOP实现前后置



## 疑问

~~疑问：通过注释如何显示属性的注入~~使用@Value（“值”）对属性进行注入

通过@Configuration 来代替xml文件对Bean进行配置

https://www.cnblogs.com/duanxz/p/7493276.html