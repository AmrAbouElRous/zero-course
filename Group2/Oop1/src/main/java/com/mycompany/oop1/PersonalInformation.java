/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop1;

/**
 *
 * @author amr
 */
public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String bloodGroup;
    private String accountNumber;
    private String nationality;
    private int yearOfBearth;

    public PersonalInformation() {
    }
        

    public PersonalInformation(String firstName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBearth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBearth = yearOfBearth;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" + "firstName=" + firstName + ", lastName=" + lastName + ", bloodGroup=" + bloodGroup + ", accountNumber=" + accountNumber + ", nationality=" + nationality + ", yearOfBearth=" + yearOfBearth + '}';
    }
    
    
}
