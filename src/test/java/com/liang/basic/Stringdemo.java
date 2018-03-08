package com.liang.basic;

import org.junit.Test;

public class Stringdemo {

    /**
     * Q1:字符串不可变性
     * 如果现有字符串后面添加新的串,必须新开辟空间保存新的字符串
     *
     */
    @Test
    public void test1(){
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);

        s1 += "hadoop";
        System.out.println(s2);
    }

    /**
     * Q2: String str = new String("xxxx"); // 在内存中存在几个对象?
     * 如果常量池中存在该字符串,则只在堆空间中新建一个对象指向常量池中的该字符串
     * 如果没有,则涉及到在堆空间中new一个对象,同时,在字符串常量池中放入该字符串对象
     *
     * Person p1 = new Person("Jack",22);
     * Person p2 = new Person("Jack",12);
     * System.out.println(p1.getName() == p2.getName()) ===> true
     *
     */

    /**
     * Q3: String 类中常用的方法
     * length(),indexOf(String,str),subString(int start,int end),trim(),toString(),equals(),
     * valueOf(),toCharArray()
     */

    /**
     * Q4: String StringBuffer StringBuilder 区别? 扩容问题
     */

}
