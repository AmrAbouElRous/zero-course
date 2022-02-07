/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author amr
 */
public class Main8 extends ArrayList {
    public static void main(String[] args) {
        Main8 m1 = new Main8();//0 1  2  3  4  5  6  7  8  9
        m1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        m1.removeRange(2, 5);//[2,5)
        System.out.println(m1);//[10, 20, 60, 70, 80, 90, 100]
        

//        //|||||||||WRONG|||||||| removeRange(int,int) HAS PROTECTED ACCESS IN ARRAYLIST
//        ArrayList m2 = new Main8();
//        m2.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
//        m2.removeRange(2, 5);//[2,5)
//        System.out.println(m2);
        
    }
    
}
