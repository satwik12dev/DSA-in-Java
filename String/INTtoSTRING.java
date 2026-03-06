package String;

import java.util.Scanner;

public class INTtoSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

//        String str = "";//empty string length =0
//        str+=x;
//        System.out.println(str);

        String s = Integer.toString(x);
        System.out.println(s);
    }
}
