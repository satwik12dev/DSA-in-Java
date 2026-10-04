package Pattern;

public class Pattern12th {
    public static void main(String[] args) {
        //1
        //A B
        //1 2 3
        //A B C D
        //1 2 3 4 5

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++){
                if(i%2!=0){
                    System.out.print(j+" ");
                }
                else {
                    System.out.print((char) (j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
