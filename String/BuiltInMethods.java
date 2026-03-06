package String;

public class BuiltInMethods {
    public static void main(String[] args) {
        String str = "Satwik Saxena";
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String s1 = "Satwik";
        System.out.println(s1.contains("Sat"));
        System.out.println(s1.contains("Sati"));
        System.out.println(s1.contains("Harsh"));

        System.out.println(s1.startsWith("Satw"));
        System.out.println(s1.endsWith("ik"));

        String s3="Satwik";
        String s2 = "Trisha";
        System.out.println(s3.compareTo(s2));
        s2 = s2.concat(s3);
        System.out.println(s2);
        System.out.println(s3.concat(s2));


        String str5 = "7567854";
        int n = Integer.parseInt(str5);
        n+=1;
        System.out.println(n);
    }
}
