package IfElse;

import java.util.Scanner;

public class CostpriceSellingprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price:");
        int cp = sc.nextInt();

        System.out.println("Enter selling price:");
        int sp = sc.nextInt();


        if(sp>cp){
            System.out.println("Seller made profit...");
            int profit = sp - cp;
            System.out.println("Profit amount is : "+profit);
        }else{
            System.out.println("Seller incurred loss....");
            int loss = cp-sp;
            System.out.println("Loss amount is : "+loss);
        }


    }

}
