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
public class Main2 {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add(10);
        list1.add(50);
        list1.addAll(1,Arrays.asList(20,30,40) ); 
        System.out.println(list1);
        
//        WRONG , COLLECTION IS A LIST NOT ARRAY
//        int arr[] ={20,30,40};
//        list1.addAll(1,arr);

    }
    
}
