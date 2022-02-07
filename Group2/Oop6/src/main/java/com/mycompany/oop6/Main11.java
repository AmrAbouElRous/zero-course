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
public class Main11 {

    public static void main(String[] args) {
        Object arr[] = new Object[4];
        arr[0]="a";
        arr[1]=77;
        arr[2]=7.5;
        arr[3]=new Main11();
        int x = arr.length;
//        for (int i = 0; i < x; i++) {
//            System.out.println(arr[i]);
//        }
        for (Object obj : arr) {
            System.out.println(obj);
        }
        
        
    }

}
