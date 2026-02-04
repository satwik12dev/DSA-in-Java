package Sorting;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k =3;
        int smallest = kthSmallest(arr,k);
        System.out.println(smallest);
    }

    static int kthSmallest(int[] arr,int k){
        int n = arr.length;
        for(int i =0;i<k;i++){
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
        return arr[k-1];
    }
}
