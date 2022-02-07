/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop1;


public class Employee {
    int id ;
    float salary;
    PersonalInformation personInfo;
    Department dept ;
    Employee(int id,float s,String f,String l,String bG,String aN,String n,int y,Department dept){
        this.id=id;
        this.salary=s;
        personInfo = new PersonalInformation(f,l,bG,aN,n,y);
        this.dept=dept;
        
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", salary=" + salary + ", personInfo=" + personInfo + ", dept=" + dept.toString() + '}';
    }
    
}
