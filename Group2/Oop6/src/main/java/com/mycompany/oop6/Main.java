/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author amr
 */
public class Main {
//     int[] list3 = new int[2];
//        list3[0]=1;
//        list3[1]=3;  
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        ArrayList<Integer> list2 = new ArrayList();
        list2.add(44);
        list2.addAll(0, list1);
        list2.addAll(Arrays.asList(40,50,60));
        System.out.println(list2);
        ArrayList<Integer> list3 = new ArrayList(Arrays.asList(40,50,60));
        System.out.println(list3);
    }

}
