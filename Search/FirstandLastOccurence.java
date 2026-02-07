package Search;

import java.util.ArrayList;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int tar = 2;
        occurence(arr,tar);
    }

    static void occurence(int[] arr, int tar){
        int low = 0;
        int high = arr.length-1;
        int idx = -1;
        ArrayList<Integer> ans = new ArrayList<>();

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==tar){
                idx = mid;
                high = mid - 1;
            }
            else if (arr[mid]<tar) low = mid+1;
            else if (arr[mid]>tar) high = mid-1;
        }
        ans.add(idx);
        System.out.println(ans);
        int low1=0,high1=arr.length-1;
        int idx1 = -1;
        while(low1<=high1){
            int mid = (low1+high1)/2;

            if(arr[mid]==tar){
                idx1 = mid;
                low1 = mid + 1;
            }
            else if (arr[mid]<tar) low1 = mid+1;
            else if (arr[mid]>tar) high1 = mid-1;
        }
        ans.add(idx1);
        System.out.println(ans);
    }
}
