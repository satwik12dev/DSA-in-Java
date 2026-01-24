package Loops;

public class PrintAllAlphabetsusingASCIIvalues {
    public static void main(String[] args) {
        char ch = 'A';
        char ch1 = 'Z';
        for (int i = (int) ch; i <=(int) ch1; i++) {
            System.out.println((char) i + "."+i);
        }
    }
}