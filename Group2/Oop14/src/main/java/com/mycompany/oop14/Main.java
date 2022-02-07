/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop14;

//مثال صعب نوعا ما
public class Main {
    public static void main(String[] args) {
        SelfDrivable myCar ;
        Car car = new Car();
        CarV1 car2 = new CarV1();
        
        myCar =new CarV1();
//      myCar =new Car(); //Wrong because Car class doesnot implement SelfDrivable Interface
                          // incompatible types Object cannot be converted to SelfDrivable
//        myCar =(SelfDrivable) new Car(); //Exception هيظهر وقت تنفيذ الرنامج 
        
//        myCar = car2.obj(); //Wrong incompatible types Object cannot be converted to SelfDrivable
//        myCar = car.obj(); //Wrong incompatible types Object cannot be converted to SelfDrivable
        
        myCar=(SelfDrivable)car2.obj();
        myCar.driveTo("Mekkah");
        myCar=(SelfDrivable)car.obj();
        myCar.driveTo("Madinah");
        
        
    }
}
