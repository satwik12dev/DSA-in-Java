package String;

import java.util.Scanner;

public class DigitsInaGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        String str = Double.toString(x);
        System.out.println(str.length());
    }
}
