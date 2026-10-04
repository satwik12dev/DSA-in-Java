package Pattern;

public class Pattern7th {
    public static void main(String[] args) {
        //A A A A
        //B B B B
        //C C C C
        //D D D D

        for (int i =1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print((char) (i+64)+" ");
            }
            System.out.println();
        }
    }
}
