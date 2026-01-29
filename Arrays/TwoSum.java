package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the tarrget sum:");
        int target = sc.nextInt();
        twosum(arr,n,target);
    }

    static void twosum(int[] arr, int n, int target){
        boolean isFound = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0;j < i; j++){
                if(arr[i]+arr[j]==target) {
                    isFound=true;
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                    break;
                }
            }
        }
    }
}
