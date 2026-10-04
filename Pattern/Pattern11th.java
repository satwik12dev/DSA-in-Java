package Pattern;

public class Pattern11th {
    public static void main(String[] args) {
        //A
        //A B
        //A B C
        //A B C D


        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }
    }
}
