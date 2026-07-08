package Recursion;

import java.util.Scanner;

public class printNto1 {

    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
//        print(n);
        nto1(n);
    }

    //  recursion 1 to n
    public static void print(int x){
        if(x>n) return;
        System.out.println(x+" ");
        print(x+1);
    }

    //recursion n to 1 and 1 to n
    public static void nto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        nto1(n - 1);
        if (n != 1) {
            System.out.print(n + " ");
        }
    }
}
