package Recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(nthfibonacci(n));
    }
    public static int nthfibonacci(int n){
        if(n<=1) return n;
        return (nthfibonacci(n-1)+nthfibonacci(n-2));
    }
}
//T.C. 2^n