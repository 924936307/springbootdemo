这个是个springboot的demo

springboot的参考文章地址：https://www.cnblogs.com/zhangbin1989/p/9473292.html
sharding-jdbc的参考文档：https://www.jianshu.com/p/075a9f21d538
sharding-jdbc 参考源码：https://github.com/feelwing1314/shardingsphere-multitenancy
前端的参考bootstrap：https://v2.bootcss.com/

项目的目的：
1.熟悉springboot
2.搭建一个简单的web项目
3.主要是为了写sharding-jdbc的demo


springboot默认是集成的thymleaf。
springboot是约定大于配置的，我们来看看关于thymleaf的约定
（1）默认静态文件（js，css，jpg等）放在resources下面的static文件夹下面
（2）页面文件放在templates文件夹下面

springboot的配置文件分为两种：application.properties和application.yml，默认的是application.properties 这里使用的是aplication.yml


spring:
application:
name: myspringboot
output:
ansi:
enabled: always
profiles:
active: dev
thymeleaf:
encoding: UTF-8
prefix: classpath:/templates/

server:
tomcat:
uri-encoding: UTF-8
max-connections: 500
min-spare-threads: 25
max-threads: 300
accept-count: 200
port: 8089
mybatis:
type-aliases-package: com.wolf.springbootdemo.mapper
mapper-locations: classpath:mapping/*.xml

pagehelper:
helper-dialect: mysql
reasonable: true
support-methods-arguments: true
params: count=countSql
logging:
level:
com.wolf.springbootdemo.mapper: debug

#开发配置
spring:
profiles: dev
datasource:
url: jdbc:mysql://localhost:3306/ssmdemo?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&useSSL=false
username: root
password:
driver-class-name: com.mysql.jdbc.Driver
type: com.alibaba.druid.pool.DruidDataSource
filters: stat
maxActive: 20
initialSize: 1
maxWait: 60000
minIdle: 1
timeBetweenEvictionRunsMillis: 60000
minEvictableIdleTimeMillis: 300000
validationQuery: select 'x'
testWhileIdle: true
testOnBorrow: false
testOnReturn: false
poolPreparedStatements: true
maxOpenPreparedStatements: 20

