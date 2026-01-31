package Pattern;

public class Pattern25tth {
    /*
            1 2 3 4 5 6 7
        1   - - - * - - -
        2   - - * * * - -
        3   - * * * * * -
        4   * * * * * * *
     */
    public static void main(String[] args) {
        int r = 4;
        int c = 7;
        pattern(r, c);
    }

    static void pattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int space = 1; space <= r - i; space++) {
                System.out.print("-");
            }
// print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}