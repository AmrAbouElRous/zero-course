/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;

/**
 *
 * @author amr
 */
public abstract class SuvMahmoud extends SuvBelal {
    @Override
    void parkingSensor(){System.out.println("parking Sensor for Mahmoud");}

    public SuvMahmoud(int numOfWheels, float height, float weight) {
        super(numOfWheels, height, weight);
    }
    
    
}
