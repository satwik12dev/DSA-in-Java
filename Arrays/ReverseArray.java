package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9};
        reverse(arr);
        reverse2(arr);
    }

    //Method 1 --> Reverse Indexing or loop conditions
    static void reverse(int[] arr){
        int n = arr.length;

        for(int i = n-1; i>= 0 ;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Method 2 --> Swapping
    static void reverse2(int[] arr){
        int n = arr.length;
//        int i =0, j=n-1;
//
//        while(i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j]= temp;
//            i++;
//            j--;
//        }

        for(int i = 0 ;i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
