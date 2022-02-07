/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;

/**
 *
 * @author amr
 */
public class HatchBack extends Car{

    @Override
    void autoPilot() {
        System.out.println("autPilot");
    }

    @Override
    void streaming() {
        System.out.println("streaming");
    }

    @Override
    void parkingSensor() {
        System.out.println("parkingSensor");
    }

    public HatchBack(int numOfWheels, float height, float weight) {
        super(numOfWheels, height, weight);
    }
    @Override
    public String toString(){return super.toString();}
    
}
