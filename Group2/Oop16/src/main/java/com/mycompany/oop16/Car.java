/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop16;

/**
 *
 * @author amr
 */
public  class Car <T> implements GenericInterface <T> {

    @Override
    public T obj() {
        System.out.println("o1");
        return (T) new Car();
    }
    @Override
    public void test(){System.out.println("bbb");}

   
}
