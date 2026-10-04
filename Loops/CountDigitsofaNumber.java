package Loops;

import java.util.Scanner;

public class CountDigitsofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long n = sc.nextLong();
        int sum = 0;
        for (long i = n; i >= 0; i--) {
            i/=10;
            sum++;
        }
        System.out.println(sum);
    }
}
