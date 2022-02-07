/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        ArrayList list1 = new ArrayList();
        while(input.hasNextInt()){
            list1.add(input.nextInt());
        }
        System.out.println(list1);
        
    }
    
}
