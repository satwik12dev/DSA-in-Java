package Recursion;

public class UniquePath {
    public static void main(String[] args) {
        int m = 4, n = 5;
        System.out.println(paths(m,n));
        System.out.println(paths2(m,n));
        System.out.println(paths3(m,n));
    }

    public static int paths(int m, int n){
        if(m==1 || n==1) return 1;
        return (paths(m-1,n) + paths(m,n-1));
    }

    public static int unique(int cr, int cc, int lr, int lc){
        if(cr==lr && cc==lc) return 1;
        if(cr>lr || cc>lc) return 0;
        int right = unique(cr,cc+1,lr,lc);
        int down = unique(cr+1,cc,lr,lc);
        return right+down;
    }
    public static int paths2(int m, int n){
        return unique(0,0,m-1,n-1);
    }

    public static int paths3(int m,int n){
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        int right = paths3(m,n-1);
        int down = paths3(m-1,n);
        return right+down;
    }
}