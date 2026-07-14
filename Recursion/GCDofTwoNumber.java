package Recursion;

public class GCDofTwoNumber {
    public static void main(String[] args) {
        int a = 29, b=41;
        System.out.println(gcd(a,b));
        System.out.println(gcd2(a,b));
    }

    //basic for loop
    public static int gcd(int a, int b){
        int hcf = 1;
        int num = Math.min(a,b);
        for(int i = 1; i<num;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        return hcf;
    }

    //recursion
    public static int gcd2(int a, int b){
        return (helper(Math.min(a,b),Math.max(a,b)));
    }

    public static int helper(int a, int b){
        if(a==0 ) return b;
        return (helper(b%a,a));
    }
}
