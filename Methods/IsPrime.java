package Methods;

public class IsPrime {
    public static void main(String[] args) {
        isprime(13);
        isprime(17);
        isprime(24);
        isprime(169);
        isprime(563);
    }

    public static void isprime(int x){
        int res = 0;
        if(x<2){
            System.out.println("Num not prime");
        }
        for (int i = 1 ;i<=x/2;i++){
            if(x%i==0)
                res++;
            }
        if(res==1){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
        }
    }