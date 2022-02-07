/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author amr
 */
public class Main {

    public static void main(String[] args) {
        List list1 = new ArrayList();
        Car myCar = new Car();
        myCar.driveTo("Quds");
        myCar.selfDrive(true);
        if (myCar instanceof SelfDrivable.AirConditioning) {System.out.println("AirConditioning activated");}else{System.out.println("AirConditioning disabled");}
            
       
    }
}
