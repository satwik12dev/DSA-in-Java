package TwoDimensionalArray;

public class MinElementAmongMaxfromRows {
    public static void main(String[] args) {
        int[][] arr= {{5,9,8,7},{1,5,6,8},{1,2,6   ,7}};
        MinamongMaxrow(arr);
    }
    static void MinamongMaxrow(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int maxes = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>maxes) maxes = arr[i][j];
            }
            if(min>maxes) min=maxes;
        }
        System.out.println(min);
    }
}
