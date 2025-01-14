/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class ifelsetest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 500: ");
        int number = scanner.nextInt();
        
        if(number < 1 || number > 500 ){
            System.out.println("Invalid Input! Enter a number bwtween 1 to 500");
        }else{
            if (number < 200){
                System.out.println("You Win!");
                
            }else{
                System.out.println("You Lost!");
            }
         
        }
        
        scanner.close();
    }
    
}
