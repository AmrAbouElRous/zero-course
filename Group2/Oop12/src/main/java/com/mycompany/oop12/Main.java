/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop12;

/**
 *
 * @author amr
 */
public class Main {
    static void fun(NewInterface n1){
      n1.TestDefault();
      
    }
    public static void main(String[] args) {
        fun(new Car());
        
        Car myCar2 = new Car();
        myCar2.msg();
    }
}
