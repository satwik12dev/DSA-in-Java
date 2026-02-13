package Arrays;

import java.util.ArrayList;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        int[] b = {1,2,3,6,7};
        System.out.println(Union(a,b));
    }

    static ArrayList<Integer> Union(int[] a,int[] b){
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (ans.size() > 0 && ans.get(ans.size() - 1) == Math.min(a[i], b[j])) {
                if (a[i] < b[j]) i++;
                else if (a[i] > b[j]) j++;
                else {
                    i++;
                    j++;
                }
                continue;
            }

            if (a[i] < b[j]) {
                ans.add(a[i]);
                i++;
            }
            else if (a[i] > b[j]) {
                ans.add(b[j]);
                j++;
            }
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }

        // Remaining elements of a
        while (i < a.length) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        // Remaining elements of b
        while (j < b.length) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
}
