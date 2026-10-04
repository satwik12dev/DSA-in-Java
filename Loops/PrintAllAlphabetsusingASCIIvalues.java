package Loops;

public class PrintAllAlphabetsusingASCIIvalues {
    public static void main(String[] args) {
        char ch = 'a';
        char ch1 = 'z';
        for (int i = (int) ch; i <=(int) ch1; i++) {
            System.out.println((char) i + "."+i);
        }
    }
}