package TwoDimensionalArray;

import static TwoDimensionalArray.ReverseRowandThenColumns.print;

public class Transpose{
    public static void main(String[] args) {
        int[][] arr = {{2,1,3},{5,6,7},{8,7,9}};
        System.out.println("Array");
        print(arr);
        System.out.println("Transpose array:");
        transpose(arr);


        int[][] b = {{1,2,3,4},{5,6,7,8}};
        rectTranspose(b);
    }

    static void transpose(int[][] arr){
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
        print(arr);
    }

    static void rectTranspose(int[][] arr){
        int row = arr.length;
        int cols = arr[0].length;

        int[][] b = new  int[cols][row];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = arr[j][i];
            }
        }
        print(b);

    }
}
