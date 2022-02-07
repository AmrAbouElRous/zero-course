/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;

/**
 *
 * @author amr
 */
public class Main {
    public static void main(String[] args) {
        Car s1 = new Sedan(4,2,350);
        s1.autoPilot();
        System.out.println(s1.toString());
        s1.setWeight(500);
        System.out.println(s1.toString());
    }
}
