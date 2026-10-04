package Loops;

import java.util.Scanner;

public class aPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        double res = Math.pow(n,b);
        System.out.println(res);
        int res1 = 1;

        // USING FOR LOOP
        for (int i = 1; i <= b; i++) {
            res1 = res1 * n;
        }
        System.out.println(res1);
    }
}