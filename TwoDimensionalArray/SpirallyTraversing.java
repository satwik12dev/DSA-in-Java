package TwoDimensionalArray;

import java.util.ArrayList;

public class SpirallyTraversing {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralTraversal(arr));
    }

    static ArrayList<Integer> spiralTraversal(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int firstrow = 0;
        int lastrow = m-1;

        int firstcol = 0;
        int lastcol = n-1;


        while (firstrow<=lastrow && firstcol<=lastcol){

            for(int j=firstcol;j<=lastcol;j++)
                ans.add(arr[firstrow][j]); //right
            firstrow++;
            if(firstrow>lastrow || firstcol>lastcol) break;

            for (int i = firstrow; i <= lastrow ;i++)
                ans.add(arr[i][lastcol]); //
            lastcol--;
            if(firstrow>lastrow || firstcol>lastcol) break;

            for (int j = lastcol; j >=firstcol ; j--)
                ans.add(arr[lastrow][j]);
            lastrow--;
            if(firstrow>lastrow || firstcol>lastcol) break;

            for (int i = lastrow;i>=firstrow;i--)
                ans.add(arr[i][firstcol]);
            firstcol++;
            if(firstrow>lastrow || firstcol>lastcol) break;

        }
        return ans;
    }
}
