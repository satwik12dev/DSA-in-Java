package Search;

public class PeakElementinMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0,8,9};
        int res = FindPeak(arr);
        System.out.println(res);
    }
    static int FindPeak(int[] arr){
        int low = 1;
        int high = arr.length;

        while (low<=high){

            int mid = (low + high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
