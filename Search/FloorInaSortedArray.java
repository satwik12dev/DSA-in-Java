package Search;

public class FloorInaSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,3,4,4,4,5,6,6,8};
        int x = 8;
        int res = FloorInSortedArray(arr,x);
        System.out.println(res);
    }

     static int FloorInSortedArray(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int ans  = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(x>0 && arr[mid]/x==0){
                ans = mid;
                low = mid+1;
            } else if (x>0 && arr[mid]==x) {
                ans = mid;
                low = mid +1;
            } else high = mid-1;
        }

        return ans;
     }
}
