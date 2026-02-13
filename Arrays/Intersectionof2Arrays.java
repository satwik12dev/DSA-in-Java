package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersectionof2Arrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};

        int[] num3 = Intersection(num1,num2);

        for(int ele:num3) System.out.print(ele+" ");
    }

    static int[] Intersection(int[] arr1,int[] arr2){
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
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }
}
