package Pattern;

public class Pattern18th {
    public static void main(String[] args) {
        //  12345
        //1 *---*
        //2 -*-*-
        //3 --*--
        //4 -*-*-
        //5 *----*

        for (int i = 0; i < 5; i++) {
            for(int j =0;j< 5;j++){
                if(i==j || i == 5-1){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }
}
