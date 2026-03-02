package TwoDimensionalArray;

public class MaxElement {
    public static void main(String[] args) {
        int[][] arr = {{8,9,10,11},{1300,46,59,62},{102,1503,120,159}};
        maxelement(arr);
    }

    static void maxelement(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>max) max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}
