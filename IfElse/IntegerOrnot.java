package IfElse;

import java.util.Scanner;

public class IntegerOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number : ");
        double x = sc.nextDouble();

        if(x == (int) x){ // We do this because when we type cast data loss occurs because of this if an input is not in integer then it will not type cast and we identify that number is not and integer
            System.out.println("Number is Integer");
        }else{
            System.out.println("Number is not integer");
        }
    }
}
