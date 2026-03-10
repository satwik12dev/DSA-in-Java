package String;

public class ChangeTheString {
    public static void main(String[] args) {
        String str ="AbCD";
        chnage(str);
    }
    static void chnage(String str){
        if(str.charAt(0)==str.toLowerCase().charAt(0)){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }
    }
}
