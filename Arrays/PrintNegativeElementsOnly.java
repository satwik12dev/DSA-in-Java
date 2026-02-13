package Arrays;

import java.util.Scanner;

public class  PrintNegativeElementsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        negativelements(arr,n);
    }
    public  static  void negativelements(int[] arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}