/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop7;
//create a list of distinct elements taken from user and print these elements
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        ArrayList list1 = new ArrayList();
        
        for (int i = 0; i <5; i++) {
            int temp = input.nextInt();
            if (list1.contains((Integer)temp)) {
                System.out.println("number entered before");
                
            }else{list1.add((Integer)temp);}
            
            
        }
        list1.trimToSize();
        System.out.println(list1);
    }
    
}
