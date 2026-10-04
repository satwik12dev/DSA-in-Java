package Pattern;

import java.util.Scanner;

public class Pattern21th {
    //1
    //0 1
    //1 0 1
    //0 1 0 1
    //1 0 1 0 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }

    static void pattern(int n){
        for (int i = 0; i <= n; i++) {
            for (int j =0; j<=i;j++){
                if((i+j)%2==0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
