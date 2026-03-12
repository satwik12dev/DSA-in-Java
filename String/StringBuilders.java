package String;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        System.out.println(str.length()+" "+str.capacity());
        str.append("Satwik");
        System.out.println(str);
        str.setCharAt(1,'o');
        System.out.println(str);

        String s = str.toString();
        System.out.println(s);

        str.append("gvghcvghcvhjvcjhdshjcgdhjgjhdkjdsjhdh");
        System.out.println(str.length()+""+str.capacity());


    }
}