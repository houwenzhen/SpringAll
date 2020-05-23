package com.spring.startspringboot.test;

/**
 * @author houwenzhen
 * @version 1.0
 * @date 2020/5/23 11:47
 * @descriptio
 */
public class test {
    /**
     * @Author : houwenzhen
     * @Date : 2020/5/23 11:49
     * @Description : TODO test
     * @params: s
     * @Return :  String
    */
    public String Test(String s){
        System.out.println(s);
        return null;
    }

    public static void main(String[] args) {
        test demo1 = new test();
        demo1.Test("哈哈哈哈哈");
    }
}
