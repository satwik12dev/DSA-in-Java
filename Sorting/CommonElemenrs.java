package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElemenrs {
    public static void main(String[] args) {
        int[] a = {3,4,2,2,4};
        int[] b = {3,2,2,7};
        ArrayList<Integer> ans = Common(a,b);
        System.out.print(ans);

    }

    static ArrayList<Integer> Common(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]<b[j]) i++;
            else if (a[i]>b[j]) j++;
        }
        return ans;
    }
}
