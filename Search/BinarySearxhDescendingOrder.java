package Search;

public class BinarySearxhDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {5,5,4,4,3,3,3,2,1};
        int tar = 3;
        int res = BinarySearchDescendingOrder(arr,tar);
        System.out.println(res);
    }

    static int BinarySearchDescendingOrder(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>target) low = mid+1;
            else if (arr[mid]<target) high = mid - 1;
            else if (arr[mid]==target) return mid;
        }
        return -1;
    }
}
