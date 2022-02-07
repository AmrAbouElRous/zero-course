/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop10;

/**
 *
 * @author amr
 */
public class CarV1 implements SelfDrivable,Movable {
    private int x;
    private int y;
    private int numOfPassengers;

    public CarV1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void distinction(String location) {
        System.out.print("Car1 ");
        System.out.println("Location is "+location);
    }

    @Override
    public void drive() {
        System.out.print("Car1 ");
        System.out.println("Self Srive to location");
    }

    @Override
    public void moveUp() {
        y--;
        System.out.print("Car1 ");
        System.out.println("Move up - Cordinates = ("+x+","+y+")");
        
    }

    @Override
    public void moveDown() {
        y++;
        System.out.print("Car1 ");
        System.out.println("Move Down - Cordinates = ("+x+","+y+")");
    }

    @Override
    public void moveLeft() {
        x--;
        System.out.print("Car1 ");
        System.out.println("Move Left - Cordinates = ("+x+","+y+")");
    }

    @Override
    public void moveRight() {
         x++;
         System.out.print("Car1 ");
        System.out.println("Move Right - Cordinates = ("+x+","+y+")");
    }
     

    
}

