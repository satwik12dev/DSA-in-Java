package TwoDimensionalArray;

public class ReverseRowandThenColumns {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,5},{4,9,8,6},{11,12,13,14}};
        reverse(arr);
        revers2(arr);
    }
    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void reverse(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        // Reverse each row
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols - 1 - j];
                arr[i][cols - 1 - j] = temp;
            }
        }
        //Rever Each column
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows/2; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[rows-1-i][j];
                arr[rows-1-i][j] = temp;
            }
        }
        System.out.println("reversed row and columns:");
        print(arr);
    }

    static void revers2(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
