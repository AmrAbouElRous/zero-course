/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;
import java.util.Arrays;
import java.util.ArrayList;
public class Main17 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add((Integer)10);
        list1.add(20); // لسبب ما وافق مع انه يستقبل اوبجيكت بس في الريموف هيرفض remove
        list1.trimToSize();//reduced capacity to 2
        
    }
    
}
