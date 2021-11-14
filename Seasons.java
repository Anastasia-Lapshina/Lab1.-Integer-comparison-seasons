package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter an integer: ");
            int month = scanner.nextInt();
            if (month == 1 || month == 2 || month == 12){
                System.out.println("The "+month+ "th month is in Winter");
            }
            else if (month == 3 || month == 4 || month == 5){
                System.out.println("The " +month+ "th month is in Spring");
            }
            else if (month == 6 || month == 7 || month == 8) {
                System.out.println("The " + month + "th month is in Summer");
            }
            else if (month == 9 || month == 10 || month == 11) {
                System.out.println("The " + month + "th month is in Fall");
            }
            else if (month <= 0 || month > 12){
                System.out.println("Enter an integer in range [1-12]");
            }
        }
        catch (Exception e) {
            System.out.println("Invalid data. Enter an integer instead");
        }
    }
}
