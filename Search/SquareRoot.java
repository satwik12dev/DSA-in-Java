package Search;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 20;
        int res = sqrt(n);
        System.out.println(res);
    }
    static int sqrt(int n){
        if(n==0) return 0;
        int lo = 1, hi = n;

        while(lo<=hi){
            int m = lo + (hi-lo)/2;
            if(m==n/m) return m;
            else if(m > n/m) hi = m - 1;
            else  lo = m + 1;
        }
        return hi;
    }
}
