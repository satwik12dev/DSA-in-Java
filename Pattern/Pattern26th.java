package Pattern;

public class Pattern26th {
    //  1 2 3 4 5
    //1 * * * * *
    //2 - * * * *
    //3 - - * * *
    //4 - - - * *
    //5 - - - - *
    public static void main(String[] args) {

        int n =5;
        patern(n);
    }
    static void patern(int n){
        for(int i = 1;i<=(n+1);i++){
            for(int j =1;j<=(n+1-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
