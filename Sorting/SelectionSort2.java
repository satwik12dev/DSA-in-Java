package Sorting;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] arr = {8,7,3,9,2,1};
        Selectionsort(arr);
    }

    static void Selectionsort(int[] arr){
        int n = arr.length;

        for (int i = n-1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            int MaxIdx = -1;
            for (int j = i; j >= 0; j--) {
                if(arr[j]>max){
                    max = arr[j];
                    MaxIdx = j ;
                }

            }
            int temp = arr[MaxIdx];
            arr[MaxIdx] = arr[i];
            arr[i] = temp;
            System.out.println("Array after iteration "+i);
            for(int ele:arr) System.out.print(ele+" ");
            System.out.println();
        }
    }
}
