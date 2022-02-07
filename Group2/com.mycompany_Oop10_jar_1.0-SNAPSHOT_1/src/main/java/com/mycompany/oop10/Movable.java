/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.oop10;

/**
 *
 * @author amr
 */
public interface Movable {
//  int speed ; // Wrong becaust it is public static final by default and final variable should be intialized //لازم تديها قيمة عشان فاينل في الاصل
    
//   int maxSpeed;            
//   static{maxSpeed=10;}  Also Wrong beccause it can be thought of a "class constructor"
    
    
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
     //لو عايز تضيف خاصية جديدة وانت في منتصف العمل ومش عايز تعطل الناس اللي شغالة تحت 
    // الاصدار الجديد Java SE8//حل المشكلة // عن طريق default Key word // ولازم تعمل للميثود body
    //SE8
     default void newFeature(){System.out.println("dgdfwe");};
     //SE8
     static void newFeature2(){System.out.println("NewFeature 2");}
    
    
}
