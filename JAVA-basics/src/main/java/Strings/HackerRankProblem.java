package Strings;

import java.util.Scanner;

public class HackerRankProblem {
    public static void main(String[] args) {

        /*Problem Statement
        Given two strings of lowercase English letters,  and
        1. Sum the lengths of A and B
        2. Determine if A is lexicographically larger than B, If true then print Yes otherwise No
        3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
         */

        //Output
        //There are three lines of output:
        //For the first line, sum the lengths of
        //For the second line, write Yes if A is lexicographically greater than otherwise print No
        //For the third line, capitalize the first letter in both A and B and print them on a single line seperated by a space.

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int length= A.length() + B.length();

        System.out.println(length);

        if (A.compareTo(B) > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        String s = A.substring(0, 1).toUpperCase() + A.substring(1);
        String s1 = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(s+" "+s1);
    }
}
