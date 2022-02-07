/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop5;

import java.util.ArrayList;

/**
 *
 * @author amr
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        list1.add(5);
        list1.add(10);
        list1.add(55);
        list1.add(0, 24);    
        System.out.println(list1);
        int x = list1.size();
        for (int i = 0; i < x; i++) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("");
        
          for (Integer num : list1) {
            System.out.print(num+" ");
        }
        
        System.out.println("");
          for (int num : list1) {
            System.out.print(num+" ");
            

        }
          
          
          
    }
}
