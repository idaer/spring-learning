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

Spring只针对面下个方法的切面（在方法执行时的面向切面）

* **`Aspect`（切面）：** Aspect 声明类似于 Java 中的类声明，在 Aspect 中会包含着一些 Pointcut 以及相应的 Advice。

* **`Joint point`（连接点）：**表示在程序中明确定义的点，典型的包括方法调用，对类成员的访问以及异常处理程序块的执行等等，它自身还可以嵌套其它 joint point。

* **`Pointcut`（切点）：**表示一组 joint point，这些 joint point 或是通过逻辑关系组合起来，或是通过通配、正则表达式等方式集中起来，它定义了相应的 Advice 将要发生的地方。

* **`Advice`（增强）：**Advice 定义了在 `Pointcut` 里面定义的程序点具体要做的操作，它通过 before、after 和 around 来区别是在每个 joint point 之前、之后还是代替执行的代码。

* **`Target`（目标对象）：**织入 `Advice` 的目标对象.。

* **`Weaving`（织入）：**将 `Aspect` 和其他对象连接起来, 并创建 `Adviced object ` 的过程

而增强又分为几种类型

* **before：**  在 join point 前被执行的 advice. 虽然 before advice 是在 join point 前被执行, 但是它并不能够阻止 join point 的执行, 除非发生了异常(即我们在 before advice 代码中, 不能人为地决定是否继续执行 join point 中的代码)
* **after return advice：** 在一个 join point 正常返回后执行的 advice
* **after throwing advice：** 当一个 join point 抛出异常后执行的 advice
* **after(final) advice ：**无论一个 join point 是正常退出还是发生了异常, 都会被执行的 advice.
* **around advice：**在 join point 前和 joint point 退出后都执行的 advice. 这个是最常用的 advice.
* **introduction：**introduction可以为原有的对象增加新的属性和方法



## 项目三：Spring Boot基础

## 疑问

~~疑问：通过注释如何显示属性的注入~~使用@Value（“值”）对属性进行注入

通过@Configuration 来代替xml文件对Bean进行配置

https://www.cnblogs.com/duanxz/p/7493276.html

