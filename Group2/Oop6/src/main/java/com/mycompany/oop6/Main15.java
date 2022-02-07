/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

import java.util.ArrayList;
import java.util.Arrays;
public class Main15 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(Arrays.asList(10,20,30,40,50));
        System.out.println(list1.isEmpty());//false
        list1.clear();
        System.out.println(list1);
        System.out.println(list1.isEmpty());//true
       
        
    }
    
}
