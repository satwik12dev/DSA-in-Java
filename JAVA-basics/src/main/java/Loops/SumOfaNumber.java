package Loops;

import java.util.Scanner;

public class SumOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i > 0 ; i/=10) {
            sum+=i%10;
        }
        System.out.println(sum);
    }
}
