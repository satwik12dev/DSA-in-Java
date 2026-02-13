package Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9,0};
        int d = 2;

        rotateLeft(arr, d);

        for(int x : arr) System.out.print(x + " ");
    }

    static void rotateLeft(int[] arr, int d){
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d-1);
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();// step 1
        reverse(arr, d, n-1);     // step 2
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
        reverse(arr, 0, n-1);     // step 3
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
    }

    static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
