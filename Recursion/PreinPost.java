package Recursion;

public class PreinPost {
    public static void main(String[] args) {
        pip(3);
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.print("Pre "+n+" "); //pre
        pip(n-1);
        System.out.print("IN "+n+" "); //in
        pip(n-1);
        System.out.print("Post "+n+" "); //post
    }
}