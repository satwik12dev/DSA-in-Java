package Recursion;

public class GCDofODDEVENSUMS {
    public static void main(String[] args) {
        System.out.println(gcdOfOddEvenSums(6));
    }
    public static int gcdOfOddEvenSums(int n) {
        int sumOdd  = 0;
        int sumEven = 0;
        int countOdd = 0;
        int countEven = 0;
        int num = 1;
        while (countOdd < n) {
            if (num % 2 != 0) {
                sumOdd += n;
                countOdd++;
            }

            num++;
        }
        while (countEven < n) {
            if (num % 2 == 0) {
                sumEven += num;
                countEven++;
            }
            num++;
        }
        return (helper(sumOdd,sumEven));
    }

    public static int helper(int a, int b){
        if(a==0 ) return b;
        return (helper(b%a,a));
    }
}
