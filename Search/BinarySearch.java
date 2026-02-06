package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-76,-4,9,28,47,49,510,615,9991,9999};
        int tar = 615;
        int result = Binarysearch(arr,tar);
        System.out.println(result);
    }

    static int Binarysearch(int[] arr, int target){
        int low =0 , high = arr.length-1;
        boolean flag = false;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>target) high = mid-1;
            else if (arr[mid]<target) low = mid + 1;
            else if (arr[mid]==target) return mid;
        }
        return -1;
    }
}
