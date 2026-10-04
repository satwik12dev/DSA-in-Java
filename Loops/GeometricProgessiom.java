package Loops;

import java.util.Scanner;

public class GeometricProgessiom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int a =2;
        int r=3;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a=a*r;
        }
    }
}