/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;

/**
 *
 * @author amr
 */
public class Sedan extends Car {
    

    @Override
    void autoPilot() {
        System.out.println("autoPilot");
    }

    @Override
    void streaming() {
        System.out.println("Streaming");
    }

    @Override
    void parkingSensor() {
        System.out.println("ParkingSensor");
    }

    public Sedan(int numOfWheels, float height, float weight) {
        super(numOfWheels, height, weight);
    }
// كدة كدة هيتم توؤيثها تلقائي انما ال كونستركتورال باراميتريزد كونستركتور مش بيتورث تلقائي لازم انت تعمله زي فوق
//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    }
      
    
    
   
    
}
