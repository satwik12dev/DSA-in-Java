package Arrays;

public class RotateArray {

    // int[] arr  = {6,8,1,2,4,9,0};
    //rotate array by d, d-->1 2 3 4 5 6...
    //rotated_array --> {2,4,9,0,6,8,1} when d=3.


    public static void main(String[] args) {
        int[] arr = {7,3,9,1};
        int d =9;
        int n = arr.length;
        d=d%n;
        rotation(arr,0,d-1);
        rotation(arr,d,n-1);
        rotation(arr,0,n-1);
        for(int ele :arr) System.out.print(ele);
    }

    static void rotation(int[] arr,int i, int j){
            while(i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
