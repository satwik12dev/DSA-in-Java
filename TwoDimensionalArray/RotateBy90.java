package TwoDimensionalArray;

import static TwoDimensionalArray.ReverseRowandThenColumns.print;

public class RotateBy90 {
    public static void main(String[] args) {
        int[][] arr = {{2,1,3},{5,6,7},{8,9,10}};
        System.out.println("Array:");
        print(arr);
        System.out.println("Array when rotated by 90:");
        rotateby90(arr);
    }
    static void rotateby90(int[][] arr){
        int row = arr.length;
        int cols = arr[0].length;

        for(int i =0;i<row;i++){
            for (int j = 0; j < i; j++) {
                if(i==j) continue;
                else{
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < cols / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols - 1 - j];
                arr[i][cols - 1 - j] = temp;
            }
        }
        print(arr);
    }
}
