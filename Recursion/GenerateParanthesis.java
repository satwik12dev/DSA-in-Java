package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(genParanthesis(n));
    }

    public static void generate(int n, int l, int r, String s, List<String> ans){
        if(r == n) {
            ans.add(s);
            return;
        }
        if(l<n) generate(n,l+1,r,s+"(",ans);
        if(r<l) generate(n,l,r+1,s+")",ans);
    }

    public static List<String> genParanthesis(int n){
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }
}
