package IfElse;

import java.util.Scanner;

public class FourDigitIntegerCheck {
    public static void main(String[] args) {
        //Ques: Take positive integer input and
        //tell if it is a four digit number or not.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = sc.nextInt();

        if(num>999 && num<10000){
            System.out.println("Number is of four digit");
        }
        else {
            System.out.println("Number is not of four digit");
        }
    }
}
