/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop17;

import java.util.ArrayList;
import java.util.List;

/**
       Car mainCar = new Car();
//        GenericInterface geneCar = new Car();
        GenericInterface<Car> geneCar = new Car();
        List<Integer> list1 = new ArrayList();
        
        
        mainCar=geneCar.carModel();
 */
public class Main {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        GenericInterface geneCar = new Car();
        Car car1 = new Car();
        car1=  (Car) geneCar.carModel();
    }
 
}
