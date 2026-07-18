package Recursion;

import java.util.Scanner;

public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tower(n, 'A', 'B', 'C');
    }
    public static void tower(int n, char a ,char b, char c){
        if(n==0) return;
        //n-1 disks from a to b via c.
        tower(n-1,a,c,b);
        //largest from a to c
        System.out.println(a+"->"+c);
        // n-1 disks from b to c via a
        tower(n-1,b,a,c);
    }
}