package Pattern;

import java.util.Scanner;

public class Pattern24th {
    //  1 2 3 4 5 6 7
    //1 - - - * * * *
    //2 - - * * * * -
    //3 - * * * * - -
    //4 * * * * - - -

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows --> ");
        int r  = sc.nextInt();
        System.out.println("Enter columns --> ");
        int c = sc.nextInt();
        pattern(r,c);
    }
    static void pattern(int r,int c){
        for (int i = 1; i < r; i++) {
            for (int j = 1;j<c;j++){
                if((i+j)>=r && (i+j)<=c) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
