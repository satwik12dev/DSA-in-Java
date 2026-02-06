package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class KthSmallestWithDuplicacy {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4,5,4};
        int k = 4;
        System.out.println(KthSmallestDuplicacy(arr,k));
    }
    static int KthSmallestDuplicacy(int[] arr, int k) {

        // 1. Sort array
        Arrays.sort(arr);

        // 2. Remove duplicates
        ArrayList<Integer> unique = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                unique.add(arr[i]);
            }
        }

        // 3. Check k
        if (k > unique.size()) {
            System.out.println("K is larger than unique elements");
        }

        // 4. Print kth smallest
        int n = unique.get(k - 1);
        return n;
    }
}
