/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amr
 */
public class Main {
    public static void main(String[] args) {
            ArrayList list1 = new ArrayList();
    ArrayList list2 = new ArrayList(5);
    ArrayList<Integer> list3 = new ArrayList();
    List list4 = new ArrayList(); //الفرق انك مش هتستفيد بالميثودس بتاعت ال ارااي ليست
                                  // List is interface so you canot make instance from it 
//    list list5 = new List(); // *** WRONG***LIST IS ABSTRACT ;Can not be instantiated
    Main m1 = new Main();
    ArrayList<Main> list= new ArrayList();
    list.add(m1);
        System.out.println(list);
    
     ArrayList<Integer>list5 = new ArrayList();
    list5.add(55);
        System.out.println(list5);
    }
   
    

}
