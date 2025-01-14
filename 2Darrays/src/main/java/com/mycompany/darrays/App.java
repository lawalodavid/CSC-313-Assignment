/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.darrays;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class App {

  public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Part a: Assign elements to the array by accepting input from the user
        System.out.println("Please enter 100 integers for the 10x10 array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Part b: Print out the input entered by the user using a for-each loop
        System.out.println("\nThe 10x10 array is:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
