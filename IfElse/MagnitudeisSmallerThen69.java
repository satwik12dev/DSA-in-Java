package IfElse;

import java.util.Scanner;

public class MagnitudeisSmallerThen69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer:");
        int n = sc.nextInt();

        if (Math.abs(n)<69){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
