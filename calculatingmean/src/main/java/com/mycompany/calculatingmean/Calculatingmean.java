/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatingmean;

/**
 *
 * @author DELL
 */
import java.util.Arrays;

public class Calculatingmean {
     public static void main(String[] args) {
        // Define the array
        int[] array = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate the mean
        double mean = calculateMean(array);
        System.out.println("Mean: " + mean);

        // Calculate the median
        double median = calculateMedian(array);
        System.out.println("Median: " + median);

        // Calculate the standard deviation
        double standardDeviation = calculateStandardDeviation(array, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate the mean
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method to calculate the median
    public static double calculateMedian(int[] array) {
        Arrays.sort(array); // Sort the array
        int n = array.length;
        if (n % 2 == 0) {
            // If even, take the average of the two middle elements
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            // If odd, take the middle element
            return array[n / 2];
        }
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumSquaredDifferences = 0;
        for (int value : array) {
            sumSquaredDifferences += Math.pow(value - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / array.length);
    }

   
}
