/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop10;

/**
 *
 * @author amr
 */
public class Main {
    static void fun(Movable m1){
    m1.moveUp();
    m1.moveDown();
    m1.moveLeft();
    m1.moveRight();
    }

    public static void main(String[] args) {
        CarV1 car1 = new CarV1(5,10);
        car1.distinction("sheikh garah");
        car1.moveDown();
        
        
        Movable car2 = new CarV1(5,10); // هيوصل للابستراكت ميثودس اللي جوا الموفابل بس
        car2.moveUp();
        car2.moveDown();
        car2.moveLeft();
        car2.moveRight();
        
        
        SelfDrivable car3 = new CarV1(5,10); // هيوصل للابستراكت ميثودس اللي جوا السيلف دريافابل
        car3.drive();
        car3.distinction("Quds");
        
        System.out.println("***********Polymrphism Concept*************");
        fun(new CarV2(15,20));
        
    }
    
}
