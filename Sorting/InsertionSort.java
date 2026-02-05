package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,7,3,9,2,8,0};
        Insertion(arr);
    }

    static void Insertion(int[] arr){
        int key = arr[0];
        int n = arr.length;

        for(int i = 0;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int tem = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tem;
                j--;
            }
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}