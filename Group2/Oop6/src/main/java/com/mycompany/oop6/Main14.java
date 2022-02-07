/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

import java.util.Arrays;
import java.util.ArrayList;
public class Main14 {
    public static void main(String[] args) {        //0  1  2  3  4  5  6  7
        ArrayList list1 = new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
        ArrayList list2 = new ArrayList(list1.subList(0, 5));
        System.out.println(list2); //[10, 20, 30, 40, 50]
        list2= new ArrayList(list1.subList(0, 8));
        System.out.println(list2);// [10, 20, 30, 40, 50, 60, 70, 80]
        
//        list2= new ArrayList(list1.subList(0, 9));***Wrong***
//        System.out.println(list2);// IndexOutOfBoundsException
        
    }
    
}
