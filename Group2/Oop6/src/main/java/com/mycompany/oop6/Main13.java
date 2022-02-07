/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author amr
 */
public class Main13 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(Arrays.asList(1,1,3,4,2,2));
        ArrayList list2 = new ArrayList(Arrays.asList(1,2,5));
        list1.retainAll(list2);
        System.out.println(list1);
        list1.retainAll(Collections.singleton(1));
        System.out.println(list1);
    }
    
}
