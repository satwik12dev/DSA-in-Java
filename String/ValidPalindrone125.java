package String;

public class ValidPalindrone125 {
    public static void main(String[] args) {
        String str = "race a car";
        System.out.println(palindrone(str));
        System.out.println(ispalindrome1(str));
    }

    public  static boolean palindrone(String str){
        int i =0;
        int j = str.length()-1;

        while(i<=j){
            while(i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static  boolean ispalindrome1(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
