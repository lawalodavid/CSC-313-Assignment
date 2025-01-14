/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printingflag1;

/**
 *
 * @author DELL
 */
public class Printingflag1 {

    public static void main(String[] args) {
       // Single loop implementation
        System.out.println("Single Loop Implementation:");
        for (int i = 0; i < 6; i++) { 
            System.out.print("*****"); 
            System.out.print("     "); 
            System.out.println("*****"); 
        }

        // Nested loop implementation
        System.out.println("\nNested Loop Implementation:");
        for (int i = 0; i < 6; i++) { // Loop for rows
            for (int j = 0; j < 15; j++) { 
                if (j < 5 || j >= 10) { 
                    System.out.print("*");
                } else { 
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
