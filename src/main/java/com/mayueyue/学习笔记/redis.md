# 1. springboot 整合redis
参考 ： https://blog.csdn.net/qq_36781505/article/details/86612988

## 1.1 项目中怎么使用redis
参考代码：
UserController 里面的 selectAll 接口

redis使用场景：
https://blog.csdn.net/qq_35568881/article/details/78779679

关注下zset 做排行榜功能：
看这里的命令
https://www.runoob.com/redis/redis-sorted-sets.html
ZADD runoobkey 5 mysql
ZrevRANGE runoobkey 0 10 WITHSCORES

# 2. aop 打印日志
## 2.1 看日志切面
https://www.cnblogs.com/youngdeng/p/12868502.html
## 2.2 自定义注解打印日志
https://blog.csdn.net/orange_bug/article/details/111272316




