package Sorting;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7,0,4,3,2,8,18};
        int target = 18;
        twosum(arr,target);
    }

    static void twosum(int[] arr, int target){
        Arrays.sort(arr); // time --> n logn, space --> n
        int i =0 ;
        int j = arr.length-1;

        while (i<j){// time --> n
            if(arr[i]+arr[j]> target){
                j--;
            } else if (arr[i]+arr[j]<target) {
                i++;
            } else if (arr[i]+arr[j]==target) {
                System.out.println("Found our elements : ["+arr[i]+","+arr[j]+"]");
                break;
            }
        }

    }
}
