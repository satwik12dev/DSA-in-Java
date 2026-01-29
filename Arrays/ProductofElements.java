package Arrays;

import java.util.Scanner;

public class ProductofElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ProductofArray(arr,n);
    }
    static void ProductofArray(int[] arr, int n){
        int pro = 1;
        for (int i=0;i<n;i++){
            pro*=arr[i];
        }
        System.out.println(pro);
    }
}
