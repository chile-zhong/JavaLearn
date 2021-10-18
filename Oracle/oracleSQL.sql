select * from tab; --查看用户下的所有表
select * from user_tables; --查询详细表内容
desc emp; --查询表字段信息

--为表加注释
comment on table emp is '雇员表';
--为表字段加注释
comment on column emp.ename is '员工名称';


-- Sql语句查询
/*
SELECT [distinct]
  column_1, 
  column_2, 
  ...
FROM
  table_name
WHERE 条件表达式
*/

--
