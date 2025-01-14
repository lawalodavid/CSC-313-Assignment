/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printingflag2;

/**
 *
 * @author DELL
 */
public class Printingflag2 {

    public static void main(String[] args) {
          System.out.println("Single Loop Implementation:");
        for (int i = 0; i < 6; i++) {
            if (i < 3) { // First 3 rows with * for the left section
                System.out.print("* * * * ");
                System.out.println("= = = = = = =");
            } else { // Last 3 rows with = for the left section
                System.out.print("= = = = = ");
                System.out.println("= = = = = =");
            }
        }

        // Nested Loop Implementation
        System.out.println("\nNested Loop Implementation:");
        for (int i = 0; i < 6; i++) { // Loop for rows
            for (int j = 0; j < 14; j++) { // Loop for columns
                if (i < 3 && j < 8) { // Top-left section: First 3 rows with * in first 8 positions
                    System.out.print((j % 2 == 0) ? "*" : " ");
                } else if (i < 3) { // Top-right section: First 3 rows with = in remaining positions
                    System.out.print("=");
                } else if (j < 10) { // Bottom-left section: Last 3 rows with = in first 10 positions
                    System.out.print("=");
                } else { // Bottom-right section: Last 3 rows with = in remaining positions
                    System.out.print("=");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
