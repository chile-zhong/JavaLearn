# SpringBoot配置
## 配置文件分类
> SpringBoot是基于约定的，所以很多配置都有默认值，但如果想使用自己的
>配置替换默认配置的话，就可以使用application.properties或者
>application.yml（application.yaml）进行配置。

- SpringBoot 提供了两种配置文件:properties和yml/yaml
- 默认配置文件名称：application
- 在同一级目录下，优先级为：properties > yml > yaml

## YAML
>YAML全称是 YAML Ain't Markup Language 。YAML是一种直观的能够被电脑识别的的数据数据序列化格式，并且容易被人类阅
 读，容易和脚本语言交互的，可以被支持YAML库的不同的编程语言程序导入，比如： C/C++, Ruby, Python, Java, Perl, C#, PHP
 等。YML文件是以数据为核心的，比传统的xml方式更加简洁。
 YAML文件的扩展名可以使用.yml或者.yaml。

- 基本语法
>⚫ 大小写敏感     
⚫ 数据值前边必须有空格，作为分隔符      
⚫ 使用缩进表示层级关系        
⚫ 缩进时不允许使用Tab键，只允许使用空格（各个系统 Tab对应的 空格数目可能不同，导致层次混乱）。        
⚫ 缩进的空格数目不重要，只要相同层级的元素左侧对齐即可        
⚫ # 表示注释，从这个字符一直到行尾，都会被解析器忽略。  


- 数据格式
> 对象(map):键值对的集合
    
> 数组: 一组按次序排列的值

>纯量: 单个的、不可分的值

    
## 读取配置的内容

@Value

Enviroment

@ConfigurationProperties     