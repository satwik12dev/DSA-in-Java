package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        //Composite Number are those number which have more than 2 factor and it starts from 4.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;

        if (n <= 3) {
            System.out.println("Number is not composite");
            return;
        }

        for(int i=2;i<n-1;i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(flag == true) System.out.println("Number is composite");
        else System.out.println("Number is not composite");

    }
}
