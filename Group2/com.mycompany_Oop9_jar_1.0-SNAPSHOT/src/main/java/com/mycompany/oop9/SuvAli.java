/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;

/**
 *
 * @author amr
 */
public abstract class SuvAli extends Car {
    @Override
     void autoPilot(){System.out.println("auto pilot for ALI");};

    abstract void streaming();
    
    abstract void parkingSensor();

    public SuvAli(int numOfWheels, float height, float weight) {
        super(numOfWheels, height, weight);
    }


    
    
    
}
