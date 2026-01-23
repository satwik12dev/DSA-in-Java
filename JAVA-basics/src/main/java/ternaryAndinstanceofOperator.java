public class ternaryAndinstanceofOperator {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        // Ternary Operator condition ? true: false;
        int result  = a>b ? a:b;
        System.out.println(result);


        //instanceof operator
        System.out.println(a instanceof Integer);

        Object obj = new String("Hello");
        System.out.println(obj instanceof String);//true
        System.out.println(obj instanceof Object);//true
        System.out.println(obj instanceof Integer);//false
    }
}
