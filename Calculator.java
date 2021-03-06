package com.company.myStuff;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Inputs
        Scanner scanner = new Scanner(System.in);
        try { //Catching string inputs
            System.out.print("Enter First Digit: ");
            double num1 = scanner.nextDouble();


            //Operators
            System.out.println("Enter Operation: ");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Exponentiation (Second digit will round down to nearest integer)");
            System.out.println("6 - Factorial (Does not work with decimals)");
            int operator = scanner.nextInt();
            // Does not need second input
            if (operator == 6) { // Factorial
                if (num1 == 0) {
                    System.out.println("Result: 1");
                } else {
                    int factorial = (int) num1 - 1;
                    for (int i = factorial; i > 0; i--) {
                        num1 *= i;
                    }
                    System.out.println("Result: " + num1);
                }
            } else if (operator < 6) {
                // Needs second input
                System.out.print("Enter Second Digit: ");
                double num2 = scanner.nextDouble();
                //Variables
                long power = (long) num2 - 1; //For Exponentiation Conversion
                int exponent = (int) power;//Argument in for loop
                double num4 = num1;     //Keeps num1 the same
                //Calculations
                if (operator == 1) { // Addition
                    System.out.println("Result: " + (num1 + num2));
                } else if (operator == 2) { // Subtraction
                    System.out.println("Result: " + (num1 - num2));
                } else if (operator == 3) { // Multiplication
                    System.out.println("Result: " + (num1 * num2));
                } else if (operator == 4) { // Division
                    if (num2 == 0) {
                        System.out.println("Result: Undefined");
                    } else
                        System.out.println("Result: " + (num1 / num2));
                } else if (operator == 5) { // Exponentiation
                    if (num2 == 0) {
                        System.out.println("Result: 1");
                    } else {
                        for (int i = 0; i < exponent; i++) {
                            num4 *= num1;
                        }
                        System.out.println("Result: " + num4);
                    }
                } else {
                    System.out.println("Not a valid operator");
                }
            } else {
                System.out.println("Invalid Input");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input");
        }
    }
}
