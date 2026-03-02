package TwoDimensionalArray;

public class RowNumWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,60},{1,3,5,7,2},{9,9,4,5,2}};
        MaxSum(arr);
    }

    static void MaxSum(int[][] arr){
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];

            }
            if(sum>maxSum){ maxSum=sum; row = i;}
        }
        System.out.println(maxSum);
        System.out.println(row);
    }
}
