/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raufsource;

/**
 *
 * @author Admin
 */
public class EnumTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Books information");
        
        for(Book b: Book.values()){
            System.out.println(b + " " + b.getTitle() +" " +  b.getYear());
        }
        
        System.out.println("\nSome Books copyrighted between 2011 and 2013\n");
        for(Book b : Book.values()){
            if(b.getYear() >= 2011 && b.getYear() <= 2013){
                System.out.println(b + " " + b.getTitle() +" " +  b.getYear());

            }
        }
    }
    
}