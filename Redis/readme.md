# Redis
## 一、Redis入门
### 1.1 案例
**1.案例**
- 12306崩溃问题
- 淘宝崩溃问题

**2.问题现象**
- 海量用户
- 高并发

**3.罪魁祸首-关系型数据库**
- 性能瓶颈:磁盘IO性能低下
- 扩展瓶颈:数据关系复杂，扩展性差，不便于大规模集群

**4.解决思路**
- 降低磁盘IO次数，越低越好   -- 内存存储
- 去除数据间关系，越简单越好  -- 不存储数据关系，仅存储数据

### 1.2 NoSQL
**1.概念**

2.作用
3.特征
4.常见NoSQL数据库
5.解决方案

### 1.3 Redis简介
- 概念:       
    Redis()是用
    
- 特征:
    1.数据间
    2.
    3.
    4.
    5.
    
- 应用
    1.
    2. 
    3. 
    4. 
    5.
    6.
    
### 1.4 下载与安装(Windows环境)

### 1.5 Redisji基本操作
**1.命令行模式工具使用思考**
- 功能性命令
- 清除屏幕信息
- 帮助信息查阅
- 退出指令

**2.信息添加**
- 功能:
> 设置key value
- 命令: 
>set key value
- 示例: 
> set name 张三

 **3.信息查询**
 - 功能
 > 根据key查询对应的value，如果不存在，返回空（nil）
 - 命令
 > get key
 - 示例
 > get name

**清空屏幕**
- 功能
>清除屏幕中的信息
- 命令
> clear

**帮助**
- 功能
- 命令

**退出客户端**


## 二、Redis数据类型
### 2.1 业务数据的特殊性
**作为缓存使用**
1. 原始业务功能设计
    1.
    2.
    3.
    4.
2. 运营平台监控到的高频发访问数据
    1. 
3. 高频、复杂的统计数据
    1. 
   
**附加功能**
1. 系统功能优化或升级
    1. 单服务升级集群
    2. session管理
    3. Token管理

### 2.2 Resis五种常用数据类型
1. string
2. hash
3. list
4. set
5. sorted_set

### 2.3 string
**1.Redis数据存储格式** 
 - redis自身是一个Map,其中所有的数据都是采用key:value的形式存储
 - 数据类型指的是存储的数据类型，也就是value部分的类型，key部分永远都是字符串
 
**2.string类型**
 
**3.基本操作**
- 添加/修改数据
> set key vale
- 获取数据
> get key 
- 删除数据
> del key 
- 添加/修改多个数据
> mset key1 value2 key2 value2...
- 获取多个数据
> mget key1 key2...
- 获取数据字符个数（字符串长度）
>strlen key
- 追加信息到原始信息后部(如果原始信息存在就追加，否者新建)
> append key value

4.单数据操作和多数据操作的选择之惑

 

