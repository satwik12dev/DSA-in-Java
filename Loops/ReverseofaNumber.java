package Loops;

import java.util.Scanner;

public class ReverseofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int r=0;
        for(int i =n;i>0;i/=10){
            r*=10;
            r+=(i%10);
        }
        System.out.println(r);
    }
}
