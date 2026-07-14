package Recursion;
import java.util.Scanner;

public class printNto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        oneton(n);
        System.out.println();
        nto1(n);
        System.out.println();
        nto1oneton(n);
    }

    //  recursion 1 to n
    public static void oneton(int x){
        if(x==0) return;
        oneton(x-1);
        System.out.print(x+" ");
    }

    // n to 1
    public static void nto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        nto1(n - 1);
    }

    //recursion n to 1 and 1 to n
    public static void nto1oneton(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        nto1oneton(n - 1);
        if (n != 1) {
            System.out.print(n + " ");
        }
    }
}