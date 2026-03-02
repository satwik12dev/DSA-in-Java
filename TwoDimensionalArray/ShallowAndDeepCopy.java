package TwoDimensionalArray;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        int[][] arr1 = {{6,0,2,7,6},{1,3,5,7,2},{9,9,4,5,2}};
        int[][] brr = {{6,0,2,7,6},{1,3,5,7,2},{9,9,4,5,2}};
        brr[1][3] = 20;
        System.out.println();
    }
}
