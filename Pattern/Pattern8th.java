package Pattern;

import java.util.Scanner;

public class Pattern8th {
    public static void main(String[] args) {
        //a a a a
        //B B B B
        //c c c c
        //D D D D

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print:");
        int r = sc.nextInt();
        System.out.println("Enter the number of rows to print:");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++){
                if(i%2!=0){
                    System.out.print((char) (i+96)+" ");
                }else{
                    System.out.print((char) (i+64)+" ");
                }
            }
            System.out.println();
        }

    }
}
