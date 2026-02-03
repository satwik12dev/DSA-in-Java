package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,3,2};
        bubbleSort(arr);
        System.out.println();
        bubbleSort2(arr);
    }


    static void bubbleSort(int[] arr){
        //non optimized approach
        int n = arr.length;
        int operation = 0;
        for (int i = 0; i < n; i++) {
            operation++;
            for(int j = 0 ;j<n;j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Total number of operations:"+operation);
    }

    static void bubbleSort2(int[] arr){
        //optimized approach
        int n = arr.length;
        int opr =0;

        for (int i = 0; i < n-1; i++) {
            opr++;
            for(int j = 0 ;j<n-1-i;j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Total number of operations:"+opr);
    }
}
