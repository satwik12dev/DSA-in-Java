package IfElse;

import java.util.Scanner;

public class CanBeTriangleSidesorNot {
    public static void main(String[] args) {
        // approach --> a+b>c
        //              b+c>a
        //              c+a>b

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a:");
        int a = sc.nextInt();
        System.out.println("Enter side b:");
        int b = sc.nextInt();
        System.out.println("Enter side c:");
        int c =  sc.nextInt();


        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("These can be sides of a triangle.");
        } else {
            System.out.println("These cannot be sides of a triangle.");
        }
    }
}
