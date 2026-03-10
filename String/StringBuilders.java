package String;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(10);
        System.out.println(str.length()+" "+str.capacity());
//        str.append("saxena");
        System.out.println(str);
        str.append(56);
        System.out.println(str);
        str.append("Satwik");
        System.out.println(str.length()+" "+str.capacity());
//        str.append("saxena");

    }
}