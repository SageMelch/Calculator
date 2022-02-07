package com.company.myStuff;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Digit: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter Second Digit: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter Operation: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        int operator = scanner.nextInt();
        if(operator == 1) {
            System.out.println("Result: "+ (num1 + num2));
        }else if(operator == 2){
            System.out.println("Result: "+ (num1 - num2));
        }else if(operator == 3){
            System.out.println("Result: "+ (num1 * num2));
        }else if(operator == 4){
            System.out.println("Result: "+ (num1 / num2));
        }else{
            System.out.println("Not a valid operator");
        }
    }
}
