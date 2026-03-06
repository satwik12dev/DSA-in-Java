package String;

public class PassingStringToMethod {
    public static void main(String[] args) {
        String str = "Satwik";
        change(str);
        System.out.println(str);
    }

    public  static void change(String str){ //pass by value
        str = "Sanya";
    }
}
