/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop16;

/**
 *
 * @author amr
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car2 car2 = new Car2();
        
        GenericInterface<Car> myCar = (GenericInterface<Car>) car1.obj();
     
        
    }
}
