package Problems;

import java.math.BigInteger;
public class Biginteger {
    public static void main(String[] args) {
        BigInteger bg = new BigInteger("1234");
        BigInteger bg2 = new BigInteger("20");

        System.out.println(bg.add(bg2));
        System.out.println(bg.multiply(bg2));
    }
}
