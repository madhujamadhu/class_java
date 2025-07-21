package com.vetclass.java;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1.add,2.subtract,3.multiply,4.divide");
        System.out.println("enter your choice");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Addition is: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division is: " + ((double) a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    
}

    

