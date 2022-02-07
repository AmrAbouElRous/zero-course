/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main20 {
    
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(Arrays.asList(2,5,3,7));
        Collections.reverse(list1);//هتعكس الليست
        System.out.println(list1);
        System.out.println(Collections.min(list1));
        System.out.println(Collections.max(list1));
        
    }
    
}
