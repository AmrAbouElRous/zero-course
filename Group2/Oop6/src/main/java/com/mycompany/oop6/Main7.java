/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author amr
 */
public class Main7 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList( Arrays.asList("AA",112,"B",45,"AA",112,"C",21,"D"));
        ArrayList list2 = new ArrayList( Arrays.asList("AA"));
//        list1.removeAll(list2);
//        list1.removeAll(Arrays.asList("AA"));
        list1.removeAll(Collections.singleton("AA"));

        System.out.println(list1);
    }
    
}
