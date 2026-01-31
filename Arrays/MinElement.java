package Arrays;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        Minelement(arr,n);
    }
    static  void Minelement(int[] arr,int n){
        int min =arr[0];

        for (int i = 0; i < n; i++) {
            if(arr[i]<min) min =arr[i];
        }
        System.out.println(min);
    }
}
