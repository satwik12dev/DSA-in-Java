package String;

public class CompareTo {
    public static void main(String[] args) {
        String s1 = "Harmanprt";
        String s2 = "Harman";
        compareto(s1,s2);

        System.out.println(s1.compareTo(s2));
    }

    static void compareto(String s1, String s2){
        int i = 0;
        int j = 0;

        while (i< s1.length() && j< s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else{
                int diff = (int) s1.charAt(i) - (int) s2.charAt(j);
                System.out.println(diff);
                break;
            }
        }
        int res = s1.length()-s2.length();
        System.out.println(res);
    }
}
