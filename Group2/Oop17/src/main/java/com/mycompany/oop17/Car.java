/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop17;

/**
 *
 * @author amr
 */
public class Car<T> implements GenericInterface<T>{

    @Override
    public T carModel() {
        System.out.println("Mabroook code success");
        return (T)new CarV1();
    }
    
}
