package Search;

public class PeakElementinMountainArray {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,5,6,8,6,3};
        int res = FindPeak(arr);
        System.out.println(res);
    }
    static int FindPeak(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while (low<=high){

            int mid = low + (high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid]>arr[mid-1]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
