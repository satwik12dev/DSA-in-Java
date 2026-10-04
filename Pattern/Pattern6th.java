package Pattern;

import java.util.Scanner;

public class Pattern6th {
    public static void main(String[] args) {
        //1 1 1 1
        //2 2 2 2
        //3 3 3 3
        //4 4 4 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows you want to print");
        int rows = sc.nextInt();
        System.out.println("Enter columns you want to print:");
        int colums = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1;j <= colums; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
