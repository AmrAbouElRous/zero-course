/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.oop12;

/**
 *
 * @author amr
 */
public interface NewInterface {
    default void TestDefault(){
        TestPrivate();
    }
    //Private methos is used to share some tasks between abstract and non-abstract methods
    //SE9
    private void TestPrivate(){
        System.out.println("We Tested Private Our private Method");
    }
    
    
}
