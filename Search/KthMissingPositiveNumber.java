package Search;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,8};
        int k = 2;
        int res = missing(arr,k);
        System.out.println(res);
    }

    static int missing(int[] arr, int k){
        int n = arr.length;
        int low = 0, high = n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int miss = arr[mid] - (mid+1);

            if(miss<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return low+k;
    }
}
