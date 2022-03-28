# Spring 学习指南

---

项目一：Hello World！

步骤1. 创建项目

步骤2.通过maven向项目内添加spring-context的jar包**(pom.xml)**

步骤3.写代码

3.1通过IOC（控制反转/xml文件配置）实现hello world

3.2通过DI（依赖注入/注释）实现hello world

**注意：**spring默认关闭DI，开启DI通过在xml里面插入一个标签

~~~ xml
<context:annotation-config/>
~~~

**疑问：通过注释如何显示属性的注入**