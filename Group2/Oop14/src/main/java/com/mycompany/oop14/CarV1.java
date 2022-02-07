/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop14;

/**
 *
 * @author amr
 */
public class CarV1 implements SelfDrivable,SelfDrivable.AirConditioning,GenericInterface {

 
    
    @Override
    public void driveTo(String name){
        System.out.println("Drive to "+name);
    }
    @Override
    public void selfDrive(boolean bol){
        if (bol==true) {System.out.println("Self Drive activated");}else{System.out.println("diable");}
    }

    @Override
    public Object obj() {
    CarV1 c2 = new CarV1();

        return c2;
    }

}
