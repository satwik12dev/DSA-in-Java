package String;

public class Plus {
    public static void main(String[] args) {
        String str = "Satwik";
        System.out.println(str);

        System.out.println(str+10+20);
        str+="\n";
        System.out.println(str);
        str+="\0";
        System.out.println(str);

        System.out.println(10+"satwik"+20);
        System.out.println(10+20+"satwik");

        System.out.println('A'+2+"satwik");
    }
}
