package com.company.myStuff;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Digit: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter Second Digit: ");
        double num2 = scanner.nextDouble();
        //Variables
        long power = (long) num2 - 1; //For Exponentiation Conversion
        int exponent = (int)power;//Argument in for loop
        double num4 = num1;     //Keeps num1 the same
        //Operators
        System.out.println("Enter Operation: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Exponentiate (Second digit will round down to the nearest integer)");
        int operator = scanner.nextInt();
        //Calculations
        if(operator == 1) {
            System.out.println("Result: "+ (num1 + num2));
        }else if(operator == 2){
            System.out.println("Result: "+ (num1 - num2));
        }else if(operator == 3){
            System.out.println("Result: "+ (num1 * num2));
        }else if(operator == 4) {
            if (num2 == 0) {
                System.out.println("Result: Undefined");
            } else
                System.out.println("Result: " + (num1 / num2));
        }else if(operator == 5){
            if(num2 == 0){
                System.out.println("Result: 1");
            }else{
                for(int i=0;i<exponent;i++){
                    num4 *= num1;
                }
                System.out.println("Result: "+num4);
            }

        }else{
            System.out.println("Not a valid operator");
        }
    }
}
