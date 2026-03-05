package TwoDimensionalArray;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{1,4},{2,5},{3,6}};

        MatrixMultiplication(arr,arr2);
    }

    static void MatrixMultiplication(int[][] arr, int[][] arr2){
        int r1 = arr.length;
        int c1 = arr[0].length;

        int r2 = arr2.length;
        int c2 = arr2[0].length;

        if (c1 != r2) {
            System.out.println("Matrix multiplication cannot be performed...");
            return;
        }

        int[][] arr3 = new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                arr3[i][j] = 0;
                for(int k =0 ;k<c1;k++){
                    arr3[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Your 2D Matrix after multiplication is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
