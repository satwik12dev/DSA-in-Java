package Recursion;

import java.util.Scanner;

public class AraisetothepowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextInt(), b=sc.nextInt();
        System.out.println(apowerb(a,b));
        System.out.println(pow(a,b));
    }

    public static long apowerb(long a, long b){
         if(b==0 ) return 1;
         return (a*apowerb(a,b-1));
    }

    public static long pow(long a,long b){
        if(b==0) return 1;
        long cal = pow(a,b/2);
        if(b%2==0){
            return (cal*cal);
        }
        else{
            return (a*cal*cal);
        }
    }

}
