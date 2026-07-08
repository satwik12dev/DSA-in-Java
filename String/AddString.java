package String;

import Problems.Biginteger;

import java.math.BigInteger;

public class AddString {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";

        System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        BigInteger num = new BigInteger(num1);
        BigInteger numb = new BigInteger(num2);
        BigInteger res = num.add(numb);

        String fin = res.toString();
        return fin;

    }
}
