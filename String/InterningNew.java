package String;

public class InterningNew {
    public static boolean equals(String s1,String s2){
        if(s1.length()==s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String name = new String("Satwik");
        System.out.println(name);

        String s = new String("Satwik");
        System.out.println(name==s);//false;
        System.out.println(name.equals(s));

        String s1  = "Satwik";
        String s2  = "Satwik";
        System.out.println(s1==s2);//true
    }
}