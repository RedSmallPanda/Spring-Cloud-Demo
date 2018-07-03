# Spring Cloud 学习与实践
## 小组成员：
* 茅悦田
* 徐家辉
* 原帅
* 顾一辉
## 学习内容：
* Spring Boot
    * Spring Boot Actuator
    * Logs
* Spring Cloud
    * Spring Cloud Eureka
    * Spring Cloud Ribbon
    * Spring Cloud Hystrix
    * Spring Cloud Zuul
<br><br>
## Spring Boot
------
### Spring Boot Actuator
在基本的 helloworld 的 *springboot* 项目中用 *maven* 引入 *actuator* 依赖,以8081端口运行后，通过 localhost:8081/actuator/{endpoints} 显示运行状况、配置信息等。
### Logs
引入 *spring-boot-starter-logging* 依赖，调用 Logger 对象向 console 输出日志。
<br><br>
## Spring Cloud
------
### Spring Cloud Eureka
分成三个基本部分：
* Eureka Server
    - 运行于8081端口，提供服务发现与注册
* service provider
    - 运行于8082端口，*microservice* 提供者
* consumer
    - 运行于8083端口，通过服务发现组件调用目标服务
### Spring Cloud Ribbon
使用 *@LoadBalanced* 注解修饰 *RestTemplate* 对象 (*consumer*)，进行负载均衡。
### Spring Cloud Hystrix
微服务架构中，作为断路器避免服务故障的传递。在 *consumer* 主类上使用 *@EnableCircuitBreaker* 注解开启断路器功能，并用 *@HystrixCommand* 注解指定回调方法。
### Spring Cloud Zuul
通过zuul服务网关，在8888端口统一接受请求，进行转发，简化服务接口，统一管理。