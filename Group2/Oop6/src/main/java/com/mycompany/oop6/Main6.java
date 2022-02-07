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
public class Main6 {
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(10,20,30));
//        list1.remove(new Integer(10));
//        list1.remove(Integer.valueOf(10));
        list1.remove((Integer)10);
        
        System.out.println(list1);
        
        ArrayList<String> list2 = new ArrayList(Arrays.asList("10","20","30"));
        list2.remove("10");
        System.out.println(list2);
    }
    
}
