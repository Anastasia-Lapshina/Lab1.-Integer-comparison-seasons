package com.company;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter an integer: ");
            int x = scanner.nextInt();

            System.out.println("Enter another integer: ");
            int y = scanner.nextInt();

            System.out.println("Enter another integer: ");
            int z = scanner.nextInt();

            System.out.println("Enter another integer: ");
            int n = scanner.nextInt();

            if (x <= y && x <= z && x <= n){
                if (x == y && y == z && z == n) {
                    System.out.println("All the integers entered are equal");
                }
                else {
                    System.out.println("The lesser integer is: " + x);
                }
            }
            else if (y <= x && y <= z && y<= n){
                if (x == y && y == z && z == n) {
                    System.out.println("All the integers entered are equal");
                }
                else {
                    System.out.println("The lesser integer is: " + y);
                }
            }
            else if (n <= x && n <= z && n <= y) {
                if (x == y && y == z && z == n) {
                    System.out.println("All the integers entered are equal");
                }
                else {
                    System.out.println("The lesser integer is: " + n);
                }
            }
            else if (z <= x && z <= y && z<= n) {
                if (x == y && y == z && z == n) {
                    System.out.println("All the integers entered are equal");
                }
                else {
                    System.out.println("The lesser integer is: " + z);
                }
            }

        }

        catch(Exception e){
            System.out.println("Invalid data. Enter an integer instead");
            }


    }
}
