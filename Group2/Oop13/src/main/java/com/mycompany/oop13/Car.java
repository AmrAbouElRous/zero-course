/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop13;

/**
 *
 * @author amr
 */
public class Car implements SelfDrivable,SelfDrivable.AirConditioning {

    public Car() {
    }
    
    @Override
    public void driveTo(String name){
        System.out.println("Drive to "+name);
    }
    @Override
    public void selfDrive(boolean bol){
        if (bol==true) {System.out.println("Self Drive activated");}else{System.out.println("diable");}
    }

}
