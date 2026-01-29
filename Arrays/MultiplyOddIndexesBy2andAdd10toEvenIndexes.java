package Arrays;

import java.util.Scanner;

public class MultiplyOddIndexesBy2andAdd10toEvenIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        solution(arr,n);
    }

    static void solution(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            if(i%2==0) arr[i]+=10;
            else arr[i]*=2;
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
