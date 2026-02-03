package Sorting;

public class MoveZeroestoEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        bubblesort(arr);
        System.out.println();
        pushZerosToEnd(arr);
    }
    static  void bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
         }
        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

     static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0 ;
        for (int i = 0; i < n ; i++) {
            if (arr[i]!=0) {
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
         System.out.print("Sorted array: ");
         for (int x : arr) {
             System.out.print(x + " ");
         }
    }
}