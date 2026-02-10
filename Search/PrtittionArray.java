package Search;

import java.util.ArrayList;

public class PrtittionArray {
    public static void main(String[] args) {
        int[] arr = {9,12,5,10,14,3,10};
        int pivot = 10;

        int[] newa = pivotArray(arr, pivot);

        for (int ele : newa) System.out.print(ele + " ");
    }

    public static int[] pivotArray(int[] arr, int pivot) {
        ArrayList<Integer> ans = new ArrayList<>();

        // smaller
        for (int num : arr) {
            if (num < pivot) ans.add(num);
        }

        // equal
        for (int num : arr) {
            if (num == pivot) ans.add(num);
        }

        // greater
        for (int num : arr) {
            if (num > pivot) ans.add(num);
        }

        // convert to array
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
