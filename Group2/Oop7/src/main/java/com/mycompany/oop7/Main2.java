/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    //create a list of distinct elements taken from user and print these elements
    
    static Scanner input = new Scanner(System.in);
    static ArrayList list1 = new ArrayList();
    static int count=0;
    static int x;
    
    static void takeListElements(int n){
    if(count==n){return;}
    x=input.nextInt();
    if(list1.contains((Integer)x)){System.out.println("Enter again"); takeListElements(n);}
    else{count++; list1.add((Integer)x);takeListElements(n);}
    
    }
    
    public static void main(String[] args) {
        
        takeListElements(7);
        System.out.println(list1);
    }
    
}
