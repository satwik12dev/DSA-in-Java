package Pattern;

public class Pattern19th {
    public static void main(String[] args) {
        //  j0123
        //i0 1
        //i1 23
        //i2 456
        //i3 78910

        int num=1;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
