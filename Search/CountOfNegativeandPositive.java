package Search;

public class CountOfNegativeandPositive {
    public static void main(String[] args) {
        int[] arr = {-2, -1, -1, 1, 2, 3};
        int res = count(arr);
        System.out.println(count(arr));
    }

    static int count(int[] arr){
        int n = arr.length;
        // first index >= 0
        int low = 0, high = n - 1;
        int firstNonNegative = 1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]>=0) {
                high = mid -1;
                firstNonNegative = mid;
            }
            else{
                low = mid +1;
            }
        }

        low =0;
        high = n-1;
        int Negstive = n;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]<0){
                Negstive = mid;
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return Math.max(Negstive,firstNonNegative);
    }
}