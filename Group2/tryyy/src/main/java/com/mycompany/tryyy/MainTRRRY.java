/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tryyy;

import java.util.Arrays;

/**
 *
 * @author amr
 */
public class MainTRRRY {
    public static void main(String[] args) {
      
     Employee e1 = new Employee("Amr",123);
     Employee e2 ;
     e2=e1;
        System.out.println(e2.getName());
        e2.setName("meme");
        System.out.println(e1.getName());
    }
    
}
