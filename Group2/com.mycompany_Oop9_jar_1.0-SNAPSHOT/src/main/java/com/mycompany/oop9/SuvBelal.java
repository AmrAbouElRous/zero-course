/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;

/**
 *
 * @author amr
 */
public abstract class SuvBelal extends SuvAli{
    
     void streaming(){System.out.println(" streaming for belal");  };
    
     abstract void parkingSensor();

    public SuvBelal(int numOfWheels, float height, float weight) {
        super(numOfWheels, height, weight);
    }
     
}
