package com.example.qianduanlearn.Service.Impl;


import com.example.qianduanlearn.Service.UserService;
import com.example.qianduanlearn.pojo.Country;
import com.example.qianduanlearn.pojo.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserServiceImpl implements UserService {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user=new User();
        user.setAge(10);
        user.setName("dms");
        user.setCountry(new Country("中国"));
        System.out.println("浅克隆前的对象"+user);
        User user_copy= (User) user.clone();
        System.out.println("克隆出的对象"+user_copy);
        System.out.println("修改原来对象的age为0");
        user.setAge(0);
        System.out.println("原对象"+user+"克隆对象"+user_copy);
        System.out.println("修改原对象姓名为杜明松");
        user.setName("杜明松");
        System.out.println("原对象"+user+"克隆对象"+user_copy);
        System.out.println("修改原对象国家为CN");
//        user.setCountry(new Country("CN"));,直接覆盖所以不会导致同索引值的修改
        user.getCountry().setName("CN");
        System.out.println("原对象"+user+"克隆对象"+user_copy);
//      TODO 数组类都实现了cloneable接口
        LinkedList list1 =new LinkedList();
        list1.add(1);
        list1.add(2);
        LinkedList list2=list1;
        LinkedList list_copy = (LinkedList) list1.clone();
        System.out.println("list1数组"+list1);
        System.out.println("list2数组"+list2);
        System.out.println("list1adding");
        list1.add(3);
        System.out.println("list1数组"+list1);
        System.out.println("list2数组"+list2);
        System.out.println("listCopy"+list_copy);
    }
}
