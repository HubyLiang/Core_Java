package com.liang.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    @Test
    public void test1() {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);

        System.out.println(stringBuffer.length());  // 4

        System.out.println(stringBuffer);   // null

        StringBuffer stringBuffer2 = new StringBuffer(str);  //java.lang.NullPointerException
        System.out.println(stringBuffer2);

    }

    @Test
    public void test2() {
        String s = null;
        s += "abc";
        System.out.println(s);
    }

    @Test
    public void test3() {
        char[] arr = new char[]{'a', 'b', 'c'};
        System.out.println(arr); //public void println(char x[]) {...}

        int[] arr1 = new int[]{1, 2, 3};
        System.out.println(arr1); //public void println(Object x) {...}

        double[] arr2 = new double[]{1.1, 2.2, 3.3};
        System.out.println(arr2);
    }

    @Test
    public void test4(){
        List<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private void updateList(List<Integer> list) {
        //不涉及到自动拆箱
        list.remove(new Integer(2));  //boolean remove(Object o);  public E remove(int index)
        list.remove(1);
    }

}
