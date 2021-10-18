package com.lxg.JHDemo;

import java.util.Objects;

/**
 * @author lxg
 * @description 演示
 * @date 2021/9/6
 */
public class Person implements Comparable{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    * 重写equals和hashCode方法，
    * 保证插入TreeSet时元素唯一性问题
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /*重写比较器，完成比较，需要实现Comparable接口,在将person对象插入以树结构为底层的集合工具TreeSet中时，
    * 自动调用此方法对person对象进行排序。
    * 按照名字的长度来进行比较
    * */
    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        if(p.name.length()>this.name.length()){
            return -1;
        }else if(p.name.length()<this.name.length()){
            return 1;
        }else{
            return 0;
        }
    }

    /*重写toString方法*/
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
