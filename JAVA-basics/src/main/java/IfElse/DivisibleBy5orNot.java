package IfElse;

import java.util.Scanner;

public class DivisibleBy5orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a integer : ");
        int num =  sc.nextInt();

        if(num%5==0){
            System.out.println("Number is divisible by 5");
        }
        else{
            System.out.println("Number is not divisible by 5");
        }
    }
}
