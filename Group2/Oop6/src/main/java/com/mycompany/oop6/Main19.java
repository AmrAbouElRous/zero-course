/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main19 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(Arrays.asList(30,10,40,50,20));
        Collections.sort(list1);// ترتيب تصاعدي
        System.out.println(list1);
        ArrayList list2 = new ArrayList(Arrays.asList(30,10,40,50,20));
        Collections.sort(list2,Collections.reverseOrder()); // ترتيب تنازلي
        System.out.println(list2);
        
    }
    
}
