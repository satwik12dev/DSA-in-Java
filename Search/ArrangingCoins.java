package Search;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        int  res = ArrangingCoins1(n);
        System.out.println(1/2);
        System.out.println(res);
        int res2 = ArranginfCoins2(n);
        System.out.println(res2 );
    }
    static int sqrt(long n){
        if(n==0) return 0;
        long lo = 1, hi = n;

        while(lo<=hi){
            long m = lo + (hi-lo)/2;
            if(m==n/m) return (int) m;
            else if(m > n/m) hi = m - 1;
            else  lo = m + 1;
        }
        return (int) hi;
    }
    static int ArrangingCoins1(int n){
        long m = (long) n;
        return (int)(sqrt(8*m+1)-1)/2;
    }

    static int ArranginfCoins2(int n){
        long lo=1,hi=n,ans=0;
        while(lo<=hi){
            long k = lo+(hi-lo)/2;
            long m = k*(k+1)/2;
            if(m==n) return (int) k;
            else if(m>n) hi = k - 1;
            else{
                ans = k;
                lo = k + 1;
            }
        }
        return (int)ans;
    }
}
