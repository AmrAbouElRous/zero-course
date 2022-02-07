/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop15;

/**
 *
 * @author amr
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car ();
        ExcecutableCar car2 = new ExcecutableCar();
        GenericInterface myCar;
        
        myCar = car1;
        myCar =(GenericInterface) car1.obj();
        myCar.testCode();
        myCar= (GenericInterface) car2.obj();
        
        myCar.testCode();
    }
}
