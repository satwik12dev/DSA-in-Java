package Problems;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormator {
    public static void main(String[] args) {
        double amount = 12324.134 ;

        NumberFormat normal = NumberFormat.getInstance();
        NumberFormat India = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println(normal.format(amount));
        System.out.println(India.format(amount));
        System.out.println(us.format(amount));
        System.out.println(China.format(amount));
        System.out.println(france.format(amount));
    }
}
