package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecindMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        SecondMax(arr,n);
        SecondMax2(arr,n);
    }
//Method 1--> Logic based
    static void SecondMax(int[] arr,int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int secmax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) continue;
            if (arr[i] > secmax) secmax = arr[i];
        }
        System.out.println(secmax);
    }

//Method 2 --> Sorting based
    static void SecondMax2(int[] arr,int n){
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }
}
