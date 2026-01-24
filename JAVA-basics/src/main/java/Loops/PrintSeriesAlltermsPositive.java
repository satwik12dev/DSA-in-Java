package Loops;

public class PrintSeriesAlltermsPositive {
    public static void main(String[] args) {
        //Print this series - 99,95,91,87,... upto all terms which are positive
        //Method 1 --> Use number of terms
//        int terms = 99;
//        for (int i = terms; i >=0 ; i-=4) {
//            System.out.println(i);
//        }

        //Method 2 --> When conditions are known
        for(int i =99;i>=0;i-=4){
            System.out.print(i+",");
        }
    }
}
