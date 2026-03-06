package String;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        char[] arr = {'s','a','t','w','i','k'};

        for(char ele:arr) System.out.print(ele+" ");
        System.out.println();

        String str = "Satwik";
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(str1);

        System.out.println(str1.charAt(5));
        System.out.println(str1.length());

    }
}