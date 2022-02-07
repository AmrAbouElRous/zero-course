/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop10;

/**
 *
 * @author amr
 */
public class CarV11 extends CarV1 implements NewInterface {
    CarV11(int x ,int y){
    super(x,y);
    }

    @Override
    public void newFeature() {
        System.out.println("NewFeature added");
    }

 
    
}
