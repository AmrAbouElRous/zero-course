/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.oop16;

/**
 *
 * @author amr

 */
public interface GenericInterface<T> {
    T obj();
    default void test(){
        System.out.println("aa");
    }
}
