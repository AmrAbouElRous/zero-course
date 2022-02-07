/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop9;

/**
 *
 * @author amr
 */
public abstract class Car {

    private int numOfWheels;
    private float height;
    private float weight;

    abstract void autoPilot();

    abstract void streaming();
    
    abstract void parkingSensor();

    public Car(int numOfWheels, float height, float weight) {
        this.numOfWheels = numOfWheels;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" + "numOfWheels=" + numOfWheels + ", height=" + height + ", weight=" + weight + '}';
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    

}
