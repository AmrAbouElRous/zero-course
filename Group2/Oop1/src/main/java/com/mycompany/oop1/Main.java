/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop1;

/**
 *
 * @author amr
 */
public class Main {
    public static void main(String[] args) {
        Department dept = new Department(3,"IT");

        Employee e1 = new Employee (200093,1000f,"amr","abou","a","45554","Egyptian",2002,dept);
        
        System.out.println(e1.toString());
    }
    
}
