/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop1;

/**
 *
 * @author amr
 */
public class Department {
    private int deptNo;
    private String deptName;

    public Department() {
    }
    
    

    public Department(int deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" + "deptNo=" + deptNo + ", deptName=" + deptName + '}';
    }
    
    
}
