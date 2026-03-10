package String;

public class SumOfAllStringsNumber {
    public static void main(String[] args) {
        String str = "6759";
        sum(str);
    }
    static void sum (String str){
        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String s = str.substring(i,j);
                sum += Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}
