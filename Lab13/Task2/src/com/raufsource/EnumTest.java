/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.raufsource;
import java.util.EnumSet;
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
        
        System.out.println("\nSome Books information\n");
        for(Book b : EnumSet.range(Book.CHTP, Book.VBHTP)){
                System.out.println(b + " " + b.getTitle() +" " +  b.getYear());            
        }
    }
    
}
//code by rauf-source check out my website for more stuff rauf-source.github.io/rauf-source for more stuff
