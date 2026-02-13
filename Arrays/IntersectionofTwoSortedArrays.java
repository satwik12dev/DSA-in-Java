package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntersectionofTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2,2,3};
        ArrayList<Integer> result = IntersectionofSortedArray(arr1,arr2);

        System.out.println(result);
    }
    
    static ArrayList<Integer> IntersectionofSortedArray(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length){
            if(ans.size()>0 && ans.get(ans.size()-1)==Math.min(arr1[i],arr2[j])){
                if(arr1[i]==arr2[j]){
                    i++;
                    j++;
                }
                else if (arr1[i]<arr2[j]) i++;
                else if (arr1[i]>arr2[j]) j++;
                continue;
            }

            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i]<arr2[j]) i++;
            else if (arr1[i]>arr2[j]) j++;
        }
        Collections.sort(ans);
        return ans;
    }
}
