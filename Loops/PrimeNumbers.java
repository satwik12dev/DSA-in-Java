package Loops;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which is to be checked that it is prime or not:");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < n-1; i++) {
            if(n%i==0) {
                flag=false;
                break;
            }
        }

        if(flag==true){
            System.out.println("Number is prime number.");
        }else{
            System.out.println("Number is not prime number");
        }
    }
}
