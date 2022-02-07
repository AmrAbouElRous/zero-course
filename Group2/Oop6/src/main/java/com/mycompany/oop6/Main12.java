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
public class Main12 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(Arrays.asList(10,20,30,40,50));
        
        System.out.println(list1.contains((Integer)10)); // ترو
        System.out.println(list1.contains(new Integer(10))); // ترو
        System.out.println(list1.contains(Integer.valueOf(10))); // ترو
        System.out.println(list1.contains(10)); // ترو لسبب ما مع انها تستقبل اوبجيكت 
//        System.out.println(list1.contains(Arrays.asList(10,20,30))); // false عشان بتستقبل اوبجيكت مش كوليكشن
        System.out.println(list1.containsAll(Arrays.asList(10,20,30)));
        
        
    }
    
}
