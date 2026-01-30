package Pattern;

public class Pattern18th {
    public static void main(String[] args) {
        //   01234
        //  j12345
        //i0 *---*
        //i1 -*-*-
        //i2 --*--
        //i3 -*-*-
        //i4 *----*

        for (int i = 0; i < 5; i++) {
            for(int j =0;j< 5;j++){
                if(i==j || i+j == 4){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
