package Recursion;

public class RecursiononArr {
    public static void main(String[] args) {
        int[] arr = {5,3,7,12,86,9,34,5};
        recursiveprint(arr,0);
        System.out.println(recursiveSearch(arr,96,0));
    }

    public static boolean recursiveSearch(int[] arr, int element, int idx){
        if(idx== arr.length) return false;
        if(arr[idx]==element) return true;
        return recursiveSearch(arr,element, idx+1);
    }

    public static void recursiveprint(int[] arr, int idx){
        if(idx== arr.length) return;
        System.out.print(arr[idx]+" ");
        recursiveprint(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
}
