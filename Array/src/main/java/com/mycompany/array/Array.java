/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;



/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Array {

   public static void main(String[] args) {
        // Declare an array of length 10
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Part a: Assign elements to the array by accepting input from the user
        System.out.println("Please enter 10 integers for the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Part b: Print out the input entered by the user using a for-each loop
        System.out.println("You entered the following values:");
        for (int value : array) {
            System.out.print(value + " ");
        }
   }
}
