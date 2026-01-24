package Loops;

public class PrintthefollowingSequence {
    public static void main(String[] args) {
        /*
        * 1         1
        * n         5
        * 2         2
        * n-1       4
        * 3         3
        * N-2       3
        * 4         4
        * n-3       2
        * 5         5
        * n-4       1
        * 6         6
        * n-5       0
         */
        int n =5;
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"\n"+(n-i));
        }
    }
}
