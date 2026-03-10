package String;

public class SubStringsOfStrings {
    public static void main(String[] args) {
        String str = "JAVA IS VERY ADVANCED LANGUAGE";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0,7));


        String s = "Satwik ";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
