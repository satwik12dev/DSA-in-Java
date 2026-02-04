package Sorting;

public class BubbleSortDescending {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i =0;i<n-1;i++){
            for(int j = i ;j<n-1;j++){
                if(arr[i]<arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
