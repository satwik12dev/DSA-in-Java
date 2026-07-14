package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,9, 12,15,19,25,29,56,126};
        System.out.println(search(arr,19));
    }

    public static int helper(int[] arr, int target, int lo, int hi ){
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(arr[mid]==target) return mid;
        else if (arr[mid]>target) return helper(arr,target,lo,mid-1);
        else return helper(arr,target,mid+1,hi);
    }

    public static int search(int[] arr, int target){
        int n = arr.length;
        return helper(arr,target,0, n-1);
    }
}

//find the first occurrence of element.
//reverse an array using recursion.