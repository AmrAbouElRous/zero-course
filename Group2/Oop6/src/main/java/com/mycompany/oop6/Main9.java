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
public class Main9 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list1.removeIf(num-> num%2==0);
        System.out.println(list1);
    }
    
}
