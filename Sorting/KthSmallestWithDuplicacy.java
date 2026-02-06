package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class KthSmallestWithDuplicacy {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4,5,4,2,6};
        int k = 6;
        System.out.println(KthSmallestDuplicacy(arr,k));
    }
    static int KthSmallestDuplicacy(int[] arr, int k) {

        Arrays.sort(arr);

        ArrayList<Integer> unique = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                unique.add(arr[i]);
            }
        }

        if (k > unique.size()) {
            System.out.println("K is larger than unique elements");
        }
        System.out.println(unique);

        int n = unique.get(k - 1);
        return n;
    }
}