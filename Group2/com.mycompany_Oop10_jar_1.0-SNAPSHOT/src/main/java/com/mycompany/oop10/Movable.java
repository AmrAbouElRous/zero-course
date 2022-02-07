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
    
    int speed =10;
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    
    
}
