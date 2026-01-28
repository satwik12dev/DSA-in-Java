package Pattern;

public class Pattern14th {
    public static void main(String[] args) {
        //1234
        //123
        //12
        //1

        for (int i = 1; i <= (4+1); i++) {
            for (int j = 1; j <= (4+1-i); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
