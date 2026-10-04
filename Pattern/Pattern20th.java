package Pattern;

public class Pattern20th {
    public static void main(String[] args) {

        int n = 4;
        pattern(n);
    }

    static void pattern(int n){
        for (int i = 1; i <= n*2; i+=2) {
            for(int j =1;j <= i;j+=2){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}