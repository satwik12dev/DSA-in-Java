package Sorting;

public class CheckIfArrayisSorted {

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,4};
        boolean check = arraySortorNot(arr);
        System.out.println(check);
    }

    static boolean arraySortorNot(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
