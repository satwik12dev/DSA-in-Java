package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr1 = {4, 1, 2, 3, 5};
        int[] arr2 = {4, 1, 2, 3, 5};
        int[] arr3 = {4, 1, 2, 3, 5};
        int[] arr4 = {4, 1, 2, 3, 5};

        System.out.println("---- Non-Optimized Bubble Sort ----");
        bubbleSort(arr1);

        System.out.println("\n---- Optimized Bubble Sort ----");
        bubbleSort2(arr2);

        System.out.println("\n---- More Optimized (isSorted flag) ----");
        bubbleSort3(arr3);

        System.out.println("\n---- Most Optimized (swap count) ----");
        bubbleSort4(arr4);
    }

    // Non-Optimized Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int operations = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                operations++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr, operations);
    }

    // Optimized Bubble Sort (Inner loop reduced)
    static void bubbleSort2(int[] arr) {
        int n = arr.length;
        int operations = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                operations++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr, operations);
    }

    // More Optimized Bubble Sort (isSorted flag)
    static void bubbleSort3(int[] arr) {
        int n = arr.length;
        int operations = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < n - 1 - i; j++) {
                operations++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        print(arr, operations);
    }

    // Most Optimized Bubble Sort (swap counter)
    static void bubbleSort4(int[] arr) {
        int n = arr.length;
        int operations = 0;

        for (int i = 0; i < n - 1; i++) {
            int swap = 0;

            for (int j = 0; j < n - 1 - i; j++) {
                operations++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) break;
        }
        print(arr, operations);
    }

    // 🔹 Print Method
    static void print(int[] arr, int operations) {
        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\nOperations: " + operations);
    }
}