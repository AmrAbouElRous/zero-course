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
public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(10,20,30));
        ArrayList<Integer> list2 ;
        list2 = (ArrayList<Integer>) list1.clone(); // type casting
        System.out.println(list2);
        list2.addAll(Arrays.asList(40,50,60));
        System.out.println(list1);
        System.out.println(list2);
    }
    
}
