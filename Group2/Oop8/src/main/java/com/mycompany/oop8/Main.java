/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
static ArrayList list1 = new ArrayList();
static Scanner input = new Scanner(System.in);
static int x;
static int n;
    
static void fun(){
x=input.nextInt();
if(x==1){System.out.println("Enter element to add");n=input.nextInt();list1.add((Integer)n);fun();}
else if(x==2){if(list1.size()>=1){System.out.println("Enter Elemet to remove");n=input.nextInt();list1.remove((Integer)n);} else{System.out.println("No elements اصلا");}fun();}
else if(x==3){System.out.println(list1);fun();}
else if(x==4){return;}
else{System.out.println("pleaze enter numbers from above");}


}    
    
    
    public static void main(String[] args) {
        System.out.println("1- Add element \n2- Remove element \n3- Print element \n4- Exist");
        fun();
    }
    
}
