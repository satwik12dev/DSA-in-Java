package IfElse;

import java.util.Scanner;

public class Takepositive {
    public static void main(String[] args) {
        //QUES: Take positive integer input and
        //print:
        //_________ if the number is divisible by 5
        //_________ if the number is divisible by 3
        //_________ if the number is divisible by 5 & 3 both
        //_________ if the number is not divisible by 5 or 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = sc.nextInt();

        if(num%5==0){
            if(num%3==0){
                System.out.println("Num is divisible by 5 and 3 both ");
            }
            else {
                System.out.println("Num is divicible by 5");
            }
        } else if (num%3==0) {
            System.out.println("Num is divisible by 3");
        }
        else if (num%5!=0 && num%3!=0) {
            System.out.println("Num is not divisible by 5 or 3");
        }
    }
}
