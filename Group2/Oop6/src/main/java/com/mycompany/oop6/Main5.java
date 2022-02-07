/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

/**
 *
 * @author amr
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Main5 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(Arrays.asList(10,20,30));
        list1.set(0, 55);
        list1.remove(0);
        System.out.println(list1);
        
    }
    
}
