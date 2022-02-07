/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop10;

/**
 *
 * @author amr
 */
public class Main {
 


    public static void main(String[] args) {
        CarV1 myCar = new CarV1(5,10);
        myCar.moveDown();
        myCar.newFeature();
//      myCar.newFeature2();//EROR Because itis Static method
        Movable.newFeature2();
    }
    
}
