package Pattern;

import java.util.Scanner;

public class Pattern22th {
    //---*
    //--**
    //-***
    //****
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                if((i+j)>n) System.out.print("*");
                else System.out.print("-");
            }
            System.out.println();
        }
    }
}
