package Recursion;

public class ReverseOfaNumber {
    public static void main(String[] args) {
        int n = 26565656;
        System.out.println(reverse(n,0));
    }

    public static int reverse(int n ,int r){
        if(n==0) return r;
        return reverse(n/10,r*10+n%10);
    }
}
