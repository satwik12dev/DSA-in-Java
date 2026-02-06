package Search;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int tar = 2;
        int res = occurence(arr,tar);
        System.out.println(res);
    }

    static int occurence(int[] arr , int tar){
        int low = 0, high = arr.length-1;
        int idx = -1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]==tar){
                idx = mid;
                high = mid - 1;
            }
            else if (arr[mid]<tar) low = mid+1;
            else if (arr[mid]>tar) high = mid-1;
        }

        return idx;
    }
}
