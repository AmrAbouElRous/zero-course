/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop3;

import java.util.Arrays;


public class Student {
    final String[] STUDENT_ID= new String[2];
    static int counter =0;

    private String name;
    
 Student(String name){
        this.name=name;
        counter++;

STUDENT_ID[0]="20";

STUDENT_ID[1]=String.format("%04d",counter );

    }

    public void printSTUDENT_ID() {
    System.out.print(name+" ");
    System.out.println(STUDENT_ID[0]+""+STUDENT_ID[1]);
//        System.out.println(Integer.parseInt());
      
        
        }
        
        
   
    
    
}
