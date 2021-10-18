# MySQL
## 数据库基本概念
   * 数据库：DataBase DB
    用于存储和管理数据的仓库
   
   * 特点
     1. 持久化存储数据。其实数据库就是一个文件系统
     2. 方便存储和管理数据
     3. 使用了同一的方式操作数据库 SQL

## MySQL数据库软件
   * 启动：net start MYSQL     
   * 关闭：net stop MYSQL        
   * 登录：
   1. mysql -u root -p root     
   2. mysql -hip -uroot -p密码
   3. mysql --host=ip --user=root --password=密码
   * 退出：    
   exit    
   quit
## SQL
### 什么是SQL？    
> Structured　Query　Language：结构化查询语言
其实就是定义了操作所有关系型数据库的规则。每一种数据库操作方式存在不一样的地方，称为“方言”。

### SQL通用语法
  - SQL语句可以单行或多行书写，以分号结尾。
  - 可以使用空格和缩进来增强可读性
  - ＭｙＳＱＬ数据库中的SQL语句不区分大小写，关键字建议使用大写
  - 注释：     
  > 单行注释：　－－　注释内容　或　＃　注释内容(mysql特有)     
  >多行注释：/* 注释内容 */

### SQL分类   
- 数据定义语言：DDL Data Definition Language
>用来定义数据库对象：数据库、表、列等
create 、drop、alter

- 数据操作语言：DML Data Manipulation Language 
>用来对数据库表中进行增删改
insert、delete、update

- 数据查询语言：DQL Data Query Language
>用来查询数据库表中记录        
select 、where

- 数据控制语言：DCL Data Control Language
>用来对数据库进行权限管理       
grant
  　　　
### DDL：操作数据、表
#### 操作数据库 CRUD
- C:Create 创建   
>创建数据库：     
CREATE DATABASE 数据库名字;      
CREATE DATABASE IF NOT EXISTS 数据库名字; -- 创建前判断是否存在       
CREATE DATABASE IF NOT EXISTS 数据库名字 CHARACTOR SET GBK; 创建的时候指定字符集

- R:Retrieve 查询
>查询所有数据库名称：         
SHOW DATABASES;      

>查询mysql这个数据库的创建语句：       
SHOW CREATE DATABASE MYSQL;      
          
- U:Update 修改 
> 修改数据库字符集      
ALTER DATABASE 数据库名字 CHARRACTOR SET 字符集名称;
           
- D:Delete 删除
> 删除数据库     
DROP DATABASE 数据库名字;        
DROP DATABASE IF EXISTS 数据库名字;      


- 使用数据库
> SELECT DATABASE(); 查询正在使用的数据库     
USE 数据库名字; 使用数据库
   
#### 操作表 CRUD
- C: 创建表
> 语法：   
        CRATE TABLE 表名(     
           列1 数据类型1,        
           列2 数据类型2,        
           列3 数据类型3,        
           列4 数据类型4,        
           ...      
        )
        
>注意最后一列不需要加逗号       
数据类型：       
int：整数类型        
age int 
>      
>double: 小数类型     
score double(5,2)         

>date: 日期，只包含年月日 yyyy-MM-dd           
>
>datetime: 日期，包含年月日时分秒 yyyy-MM-dd HH:mm:ss            

>timestamp:时间戳类型 包含年月日时分秒 yyyy-MM-dd HH:mm:ss         
如果不给这个字段赋值，或赋值为null,则默认为系统当前时间         
>
>varchar:字符串类型      
 name varchar(20) :姓名最大20个字符
               
>BLOB
CLOB
二进制
         
>创建表：
CREATE TABLE STUDENT(       
id INT,      
name VARCHAR(32),      
age int,       
score double(4,1),     
birthday date,     
insert_time TIMESTAMP      
 );      
        
>CREATE TABLE STU LIKE STUDENT; 按照student表创建stu表。
    
- R: 查询表
> 查询某个数据库中所有的表：     
           SHOW TABLES;     
查询表结构：      
           DESC 表名;

- U:修改表
> 修改表名     
        ALTER TABLE 表明 RENAME TO 新表名;       
        alter table student rename to stu;      
      
>修改表的字符集        
        show create table stu; 可以查看字符集      
        alter table 表名 character set 字符集名称;     
        alter table stu character set utf8;         
      
> 添加列       
        alter table 表明 add 列名 类型;       
        alter table stu add gender varchar(10);     
        
> 修改列的名字 类型     
        
>改名子和类型      
        alter table 表名 change 列名 新列名 类型;        
        alter table stu change gender sex varchar(20);      
        
>改类型     
        alter table stu modify 列名 新类型;      
        alter table stu modify sex varchar(10);     
      
>删除列        
        alter table 表名 drop 列名;     
        alter table stu drop  sex;      

- D:删除表     
> DROP TABLE 表明;        
DROP TABLE IF EXISTS 表名;
   
   
### DML:增删改表中数据
    * 添加数据
      语法：
         insert into table(列1，列2，...) values(值1，值2，...);
      注意：
         列名和值要一一对应，类型也要对应。
         如果表名后面不指定列名，那默认是给全部列添加值。
         除了数字类型，其他类型需要使用引号引起来
         
    * 删除数据
      语法：
        delele from 表名 [where 条件];
        truncate table stu; 删除表，然后再创建一个一摸一样的空表。
      注意：
        如果不加条件，则删除全部数据
        如果要删除全部数据，可以使用以下两种方法：
            delete from table;  比较慢，有日志
            truncate table 表名; 比较快，效率高
            
    * 修改数据
      语法
        update 表名 set 列名1 = 值1，列名2 = 值2,... [where 条件]
      注意：
        如果不加任何条件，则会将表中所有记录全部修改
           update stu set age =20; 修改了全部记录的age值   
           
  ### DQL:查询表中的记录
    语法：
      select 
         字段列表
      form 
         表名列表
      where 
         条件列表
      group by
         分组字段
      having 
         分组之后的条件
      order by
         排序
      limit
         分页限定
         
    基础查询：
      查询多个字段值
         select 字段1,字段2,... from 表名;
         select * from student3;
         select t.name,t.age from student3 t;
         select * from student3 where 
      去除重复
        DISTINCT
        select DISTINCT address from student3;
      计算列
        - 一般可以使用四则运算计算一些列的值。（一般指挥进行数值型计算）
        - ifnull(表达式1，表达式2)：null参与的运算，结果也为null
          表达式1：判断是否2为空字段
          表达式2：如果表达式1为空，则赋值表达式2
      起别名
    
    条件查询：
      where子句后跟条件
      
      运算符
      - >、<、<=、>=、=、<>
      
      - BETWEEN...AND
      
      - IN(集合) 集合表示多个值，使用逗号分隔
      
      - LIKE '张%'
        占位符：
          _:单个任意字符
          %:多个任意字符
      
      - IS NULL & is not null
    
    
    排序查询：
      语法： order by 子句
         order by 排序字段1，排序字段2.. 排序方式;
      排序方式：
        asc:升序 默认
        desc:降序
      注意:如果有多个排序条件，如果前面条件一样，才会按照后面的条件来排序。
    
    聚合函数：将一列数据作为一个整体，进行纵向的计算。
      count:计算个数
      max:计算最大值
      min:计算最小值
      sum:计算和
      avg:计算平均值
     
      注意： 聚合函数的计算排除null值;
    
    分组查询：
      语法： group by 分组字段
      注意：
        分组之后查询的字段：分组字段、聚合函数
        where 和having的区别：
           where在分组之前进行限定，如果不满足条件，则不参与分组。后不可以跟聚合函数。
           having在分组之后进行限定，如果不满足结果，则不会被查询出来。可以跟聚合函数。
    
    分页查询：
      语法： limit 开始的索引,每页查询的数据
      公式：开始的索引=（当前的页数-1）*每页显示条数。
      limit是MySQL的一个方言。
      
    
  ### 约束
    概念：对表中的数据进行限定，保证数据的正确性、有效性和完整性。
    分类：
      主键约束： primary key
         注意：
            1.含义：非空且唯一
            2.主键就是表中每条记录的唯一标识
         
         创建表时添加主键约束：
         删除主键
         创建完表之后，添加主键
         自动增长
           概念：如果某列值是数值类型的，使用auto_increment可以来完成值的自动增长。
           一般和主键一块儿使用。
         
         
      非空约束：not null 某一列的值不能为空
         创建表时添加约束
         创建表之后增加约束
      唯一约束： unique 某一列的值不能重复
         注意：
           唯一约束可以有null值，但是只能有一条记录为null值
         创建表的时候添加唯一约束
         删除唯一约束
         在表创建后添加唯一约束
      
      外键约束：foreign key,让表与表产生关系，从而保证数据的正确性
         在创建表时添加外键
           语法: 
             create table 表名(
               ...
               外键列
               constraint 外键名称 foreign key 外键列名称 reference 主表名称(主表主键名称)
             );
         删除外键
         添加外键
         
         级联操作:
            添加级联操作
              alter table 表名 add constraint 外键名称 foreign key (外键字段名字) 
              references 主表名称(主表列名称) on update cascade on delete cascade;
            分类：
              级联更新：on update cascade
              级联删除：on delete cascade
    
            
## 数据库的设计
  ### 多表之间关系
    * 一对一
        - 如：人和身份证
        - 实现方式：
            可以在任意一方添加唯一外键指向另一方的主键
            也可以将两个表合并成一张表
    * 一对多
        - 如：部门和员工：一个部门有多个部门，一个员工只能属于一个部门 员工n : 部门 1
        - 实现方式：
            在多的一方建立外键。指向一的那方的主键
            在员工信息表中增加部门编号列，作为外键指向部门表
    * 多对多 
        - 如：学生和课程 一个学生可以选择多个课程，一门课程可以被多个学生选择
        - 实现方式：
            将两张表的关系抽取出来作为一张中间关系表,关系表中有两列字段分别作为外键指向两个表，
            两列共同形成组合主键
            如：学生表、课程表、学生_课程关系表
  ### 数据库设计范式
    概念：设计关系数据库时，遵从不同的规范要求，设计出合理的关系型数据库，这些不同的规范要求被称为不同的范式，
        各种范式呈递次规范，越高范式数据库冗余越小。
        目前有六种：第一范式（1NF）、第二范式（2NF）、第三范式（3NF）
            巴斯-科德范式（BCNF）、第四范式（4NF）、第五范式（5NF 又称完美范式）
    分类：
        第一范式（1NF）:
            数据库表的每一列都是不可分割的原子数据项，而不能是集合，数组，记录等非原子数据项。
            即实体中的某个属性有多个值时，必须拆分为不同的属性。在符合第一范式（1NF）表中的每个域值只能是
            实体的一个属性或一个属性的一部分。简而言之，第一范式就是无重复的域。
            
            - 只满足第一范式存在的问题：
              1.存在非常严重的数据冗余问题
              2.增加数据有问题
              3.删除可能删除必要数据
        第二范式（2NF）:
            在1NF的基础上，非码属性必须完全依赖于码（在1NF基础上消除非主属性对主码的部分函数依赖）
            第二范式（2NF）是在第一范式（1NF）的基础上建立起来的，即满足第二范式（2NF）必须先满足第一范
            式（1NF）。第二范式（2NF）要求数据库表中的每个实例或记录必须可以被唯一地区分。选取一个能区分每
            个实体的属性或属性组，作为实体的唯一标识。例如在员工表中的身份证号码即可实现每个一员工的区分，
            该身份证号码即为候选键，任何一个候选键都可以被选作主键。在找不到候选键时，可额外增加属性以实现区
            分，如果在员工关系中，没有对其身份证号进行存储，而姓名可能会在数据库运行的某个时间重复，无法区分
            出实体时，设计辟如ID等不重复的编号以实现区分，被添加的编号或ID选作主键。（该主键的添加是在ER设
            计时添加，不是建库时随意添加）
            
            第二范式（2NF）要求实体的属性完全依赖于主关键字。所谓完全依赖是指不能存在仅依赖主关键字一部分的
            属性，如果存在，那么这个属性和主关键字的这一部分应该分离出来形成一个新的实体，新实体与原实体之间
            是一对多的关系。为实现区分通常需要为表加上一个列，以存储各个实例的唯一标识。简而言之，第二范式就
            是在第一范式的基础上属性完全依赖于主键。
            
            - 函数依赖
                A--->B:如果通过A属性（属性组）的值，可以确定唯一的B的值，称B依赖于A
                如：学号--》姓名  （学号，课程号）--》课程分数
            - 完全函数依赖：
                A-->B:如果A是属性组，则B的属性值需要依赖于A中的所有属性组合起来，即A中所有属性一起才能唯一确定B的值。
                例如：（学号，课程号）--》课程分数
            - 部分函数依赖：
                A-->B,如果A是属性组，则B的属性组的值只需要依赖A中的一些值即可。
                例如：（学号，课程号）--》姓名 （学号就可以确定姓名）
            - 传递函数依赖:
                A-->B、B-->C:如果B函数依赖A，c函数依赖B，则C传递依赖于A
                如：学号--》系名，系名--》系主任
            - 码：
                如果在一张表中，一个属性或者属性组被其他所有属性完全依赖，则称这个属性（属性组）为这个表的码。
                -- 主属性：码属性组中的所有属性
                -- 非主属性：非码中的所有属性
        第三范式（3NF）:
            在2NF基础上，任何非主属性不依赖于其它非主属性（在2NF基础上消除传递依赖）
            第三范式（3NF）是第二范式（2NF）的一个子集，即满足第三范式（3NF）必须满足第二范式（2NF）。
            简而言之，第三范式（3NF）要求一个关系中不包含已在其它关系已包含的非主关键字信息。
            例如，存在一个部门信息表，其中每个部门有部门编号（dept_id）、部门名称、部门简介等信息。
            那么在员工信息表中列出部门编号后就不能再将部门名称、部门简介等与部门有关的信息再加入员工信息表中。
            如果不存在部门信息表，则根据第三范式（3NF）也应该构建它，否则就会有大量的数据冗余。简而言之，
            第三范式就是属性不依赖于其它非主属性，也就是在满足2NF的基础上，任何非主属性不得传递依赖于主属性。
        

  ### 数据库备份和还原  
    命令行：
        语法：
            备份：mysqldump -u用户名 -p密码 数据库名称 > 保存路径
            还原：
                1.登录数据库
                2.创建数据库
                3.使用数据库
                4.执行文件。source 文件路径 
## 多表查询
    查询语法：
        select
            列名列表
        from
            表名列表
        where
            条件
    笛卡尔积；
        有两个集合A、B,取这两个集合的所有组成情况
        要完成多表查询，就要消除不必要的数据。
        
    多表查询分类：
        内连接查询：
            隐式内连接：使用where条件消除
            显示内连接：使用inner join
                select 字段列表 from 表名 inner join 表名 on 链接条件;
            注意事项：
                - 确定从那些表中查询数据
                - 确定多表链接的条件
                - 确定需要查询哪些字段
        
        外连接查询：
            左外链接：
                语法： select 字段列表 from 表1 left outer join 表2 on 条件
                      select 字段列表 from 表1 left join 表2 on 条件
                查询的是左边表的所有数据及其交集部分
            右外链接：
                语法： select 字段列表 from 表1 right outer join 表2 on 条件
                      select 字段列表 from 表1 right join 表2 on 条件
                查询的是右边表的所有数据及其交集部分
        子查询：
            概念：查询中嵌套查询，嵌套的查询就是子查询
            
            子查询的不同情况：
                1.子查询结果是单行单列
                    * 子查询可以作为条件，使用运算符去操作。运算符：= 、> 、< 等
                2.子查询结果是多行单列
                    * 子查询作为条件，使用in关键字
                3.子查询结果是多行多列
                    * 子查询可以作为一个虚拟表。

## 事务
### 事务基本介绍
    1.概念：
        如果一个包含多个步骤的业务操作(多个sql)，被事务管理，那么这些操作要么同时成功，么要同时失败。
    2.举例：张三给李四转500块钱
        - 查询张三账户余额是否大于500
        - 张三账户 金额-500
        - 李四账户 金额+500
    3.操作
        - 开启事务：start transaction
        - 回滚：rollback
        - 提交：commit
    4.MySQL数据库中事务默认自动提交
        - 事务提交的两种方式：
            * 自动提交：
                MySql就是默认自动提交的
                一条DML（增删改）语句会自动提交一次事务
            * 手动提交：
                Oracle数据库默认是手动提交的
                需要开启事务，在提交
        - 修改事物的默认提交方式
            * 查询事务默认提交方式：select @@autocommit; 1:代表自动提交 0:代表手动提交
            * 修改默认提交方式： set @@autocommit = 0;
### 事务四大特征
    1.原子性:不可分割的最小操作单位，要么同时成功，要么同时失败。
    2.持久性:如果事务一旦提交或者回滚后，数据库会持久化的保存数据。
    3.隔离性:多个事务之间，相互独立。
    4.一致性:事务操作前后，数据状态保持不变
    
### 事务的隔离级别
    * 概念:多个事务之间是相互隔离的，相互独立的。但是如果多个事务操作同一批数据，则会引发一些问题，设置不同的
          隔离级别就可以解决这些问题。
    * 存在的问题：
        1.脏读：一个事务，读取到另外一个事务没有提交的事务
        2.不可重复读：在同一次事务中，两次读取道德数据不一样
        3.幻读：一个事务操作（DML）数据中所有记录，另一个事务添加了一条数据，则第一个事务查询不到自己的修改
    * 隔离级别
        1.read uncommitted:读未提交
          产生问题：脏读、不可重复读、幻读
        2.read commitrd:读已提交（Oracle默认）
          产生问题：不可重复读、幻读
        3.repeatable read:可重复读（MySQL默认）
          产生问题：幻读
        4.serializable:串行化
          可以解决所有问题
        注意：隔离级别从小到大安全性越来越高，但是效率越来越低
        
        5.数据库查询隔离级别
            select @@tx_isolation
        6.数据库设置隔离级别
            set global transaction isolation level 级别字符串;
        

## DCL
    * DBA:数据库管理员
    *DCL:冠以用户，授权
        1.管理用户
        添加用户
            create user '用户名'@‘主机名’ identified by '密码';
            create user 'zhangsan'@'localhost' identified by '123';
            create user 'lisi'@'%' identified by 'root';
            
        删除用户
            drop user '用户名'@‘主机名’;
        修改用户密码
            update user set password = password('新密码') where user='用户名';
            set passeord for '用户名'@‘主机名’ = password('新密码');
            
            mysql中忘记了root密码怎么办？
                1.使用管理员运行cmd 执行命令：net stop mysql 停止MySQL服务
                2.使用无验证方式启动mysql服务 mysql --skip-grant-table 
                3.打开新的cmd窗口，直接输入mysql命令，敲回车就可以登录成功
                4.use mysql;
                5.update user set password=password('新密码') where user ='root';
                6.关闭两个窗口
                7.打开任务管理器，手动结束mysqld.exe进程
                8.启动mysql:net start mysql
                9.使用新的密码登录。
        查询用户
            - 切换到mysql数据库
            - 查询user表 select * from user;
            通配符： % 表示在任意主机上都可以使用这个用户登录数据库。
            
        2.权限管理
        查询权限
            show grant for '用户名'@‘主机名’;
            show grant for 'lisi'@'localhost'
        授予权限
            gran 权限列表 on 数据库名.表名 to '用户名'@‘主机名’
            grant select on mysql_test.account to 'lisi'@'localhost';
            grant all on *.* to 'zhangsan'@'localhost'
        撤销权限
            revoke 权限列表 on 数据库名.表名 from ‘用户名’@‘主机名’;
            
            
  
      