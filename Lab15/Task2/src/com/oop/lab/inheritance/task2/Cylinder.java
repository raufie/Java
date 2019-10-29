/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.inheritance.task2;

/**
 *
 * @author admin
 */
public class Cylinder extends Circle{
    
    private double height;

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }
    
    
      public double calculateArea(){
        return 2 * (super.calculateArea() +  Math.PI * super.getRadius() * height  );
    }
      
    
}
