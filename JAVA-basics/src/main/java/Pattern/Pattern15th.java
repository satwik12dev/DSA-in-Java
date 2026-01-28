package Pattern;

public class Pattern15th {
    public static void main(String[] args) {
        //a b c d
        //a b c
        //a b
        //a

        for (int i = 1; i < (4+1); i++) {
            for (int j = 1; j <= (4+1-i); j++){
                System.out.print((char) (j+96)+" ");
            }
            System.out.println();
        }
    }
}
