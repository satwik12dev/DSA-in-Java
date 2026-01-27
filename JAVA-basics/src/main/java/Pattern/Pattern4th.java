package Pattern;

import java.util.Scanner;

public class Pattern4th {
    public static void main(String[] args) {
        //A B C D
        //A B C D
        //A B C D
        //A B C D


        //This can be possible in two ways
//        //Way 1
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter character from where to start the pattern i.e. a b c d .... z :");
//        char ch = sc.nextLine().trim().charAt(0);
//        System.out.println("Enter character from where to end the pattern i.e. a b c d .... z :");
//        char ch2 =  sc.nextLine().trim().charAt(0);;
//        for (int i = 0; i <= 4; i++) {
//            for (int j = (int) ch ;j<= (int) ch2;j++){
//                System.out.print((char) j + " ");
//            }
//            System.out.println();
//        }

        //Way 2
        System.out.println("Enter rows we want to print:");
        int row = sc.nextInt();
        System.out.println("Enter column we want to print:");
        int column = sc.nextInt();
        for(int i = 1;i<=row;i++){
            for(int j = 1 ;j<=column;j++){
                System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }
    }
}
