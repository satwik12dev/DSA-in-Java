package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,9,4,1};
        Selectionsort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    static void Selectionsort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = i; j <n ; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    idx = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}
