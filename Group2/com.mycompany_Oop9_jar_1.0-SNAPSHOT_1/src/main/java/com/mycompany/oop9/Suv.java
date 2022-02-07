/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;

/**
 *
 * @author amr
 */
public class Suv extends Car{

    @Override
    void autoPilot() {
        System.out.println("autoPilot");
    }

    @Override
    void streaming() {
        System.out.println("streaming");
    }

    @Override
    void parkingSensor() {
        System.out.println("parkingSenesor");
    }

    public Suv(int numOfWheels, float height, float weight) {
        super(numOfWheels, height, weight);
    }
// كدة كدة هيتم توؤيثها تلقائي انما ال كونستركتورال باراميتريزد كونستركتور مش بيتورث تلقائي لازم انت تعمله زي فوق
//    @Override
//     public String toString(){return super.toString();}
    
}
