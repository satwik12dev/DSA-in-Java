package String;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "race";
        String s2="care";
        System.out.println(anagrams(s1,s2));
    }
    static boolean anagrams(String s1,String s2){
        if(s1.length()!=s2.length()) {return false;}
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]) return false;
        }
        return true;
    }
}