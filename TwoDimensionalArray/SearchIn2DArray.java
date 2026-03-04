package TwoDimensionalArray;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        int target = 6;
        System.out.println(search(arr,target));

    }
    static boolean search(int[][] arr, int target){
        int i =0;
        int m = arr.length;
        int j = arr[0].length-1;

        while(j>=0 && i<m){
            if(arr[i][j]==target) return true;
            else if(arr[i][j]>target) j--;
            else if(arr[i][j]<target) i++;
        }
        return false;
    }
}
