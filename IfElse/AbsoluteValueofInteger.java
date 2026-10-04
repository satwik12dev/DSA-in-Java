package IfElse;

import java.util.Scanner;

public class AbsoluteValueofInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer : ");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("Absolute values is : "+num);
        }
        else{
            num = -num; // if num = -5 then it conclude that num = -(-5) which is equal to num =5
            System.out.println("Absolute values is : "+num);
        }

        // method two
        System.out.println(Math.abs(num));
    }
}
