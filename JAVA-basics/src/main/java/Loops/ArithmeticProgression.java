package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series input:");
        int ap =sc.nextInt();
        System.out.println("Arithmetic progression:");
        for(int i=2;i<=(3*ap-1);i+=3){
            System.out.print(i+" ");
        }

    }
}
