package Pattern;

public class Pattern24 {
    public static void main(String[] args) {
        //  0 1 2 3
        //0 - - - A
        //1 - - B B
        //2 - C C C
        //3 D D D D
        int n = 5;
        pattern(n);

    }

    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                if ((i+j)>n) System.out.print((char) (i+64)+" ");
                else System.out.print("- ");
            }
            System.out.println();
        }
    }
}
