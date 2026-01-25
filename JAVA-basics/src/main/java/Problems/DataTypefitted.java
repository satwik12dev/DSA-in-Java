package Problems;

import java.util.Locale;
import java.util.Scanner;

public class DataTypefitted {
    public static void main(String[] args) {
        //Given an input integer, you must determine which primitive data types are capable of properly storing that input.
        //For each input variable n and appropriate primitive data type, you must determine if the given primitives are capable of storing it. If yes, then print:
        //Output--> n can be fitted in:
        //          * dataType
        //If the number cannot be stored in one of the four aforementioned primitives, print the line: n can't be fitted anywhere.
        Scanner sc = new Scanner(System.in);

        long x=sc.nextLong();
        System.out.println(x+" can be fitted in:");
        if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short\n* int\n* long ");
        else if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int\n* long");
        else if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
        else System.out.println(sc.next()+" can't be fitted anywhere.");
    }
}
