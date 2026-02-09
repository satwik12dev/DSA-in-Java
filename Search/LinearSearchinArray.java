package Search;

import java.util.Scanner;

public class LinearSearchinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element which is to be find by the machine:");
        int target = sc.nextInt();

        linearSearch(arr,n,target);
    }

    static void linearSearch(int[] arr, int n, int target){
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target) isFound=true; break;
        }
        if(isFound==true) System.out.println("Element found..");
        else System.out.println("Element not found...");
    }
}
