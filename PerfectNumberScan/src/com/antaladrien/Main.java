package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = myObj.nextInt();
        System.out.print(isPerfectNumber(num));

        /*System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));*/
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        if (number >= 1) {
            System.out.print("Factors: ");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + ", ");
                    sum += i;
                    if (sum == number) {
                        System.out.println("sum: " + sum);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
