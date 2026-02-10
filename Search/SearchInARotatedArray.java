package Search;

public class SearchInARotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,1,2,3};
        int tar = 10;
        int res = search(arr,tar);
        System.out.println(res);
    }

    static int search(int[] arr, int tar){
        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==tar) return mid;
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=tar && tar<arr[mid]) high = mid-1;
                else low = mid+1;
            }
            else{
                if(arr[mid]<tar && tar<=arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}
