/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;



public class Main {
    static void fun(Car car1){
    System.out.println(car1.toString());  
    
    }
    
    public static void main(String[] args) {
        
        fun(new Suv(4,2,450));
        fun(new Sedan(4,3,300));
        fun(new HatchBack(4,5,500));
        
    }
}
