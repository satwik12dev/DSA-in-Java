package Methods;

public class Test {

    public static void main(String[] args) {
        Test add = new Test();
        int[] arr = {1,2,3,4,5};
        add.sumofArray(arr);

        int[] b = {3,3,3,3,21,1,2,33};
        add.sumofArray(b);
        String  res = Upperfunc("Satwik ");
        System.out.println(res);

        int res2 = sum(3,7);
        System.out.println(res2);

        int res3 = sum(5,6,7);
        System.out.println(res3);

    }
     public void sumofArray(int[] arr){
         int res = 0;
         for (int i : arr){
             res+=i;
         }
         System.out.println(res);
     }

     private static String  Upperfunc(String str){
        return str.trim().toUpperCase();
     }

     private  static  int sum(int a , int b){
        return a+b;
     }
//overloading
    private  static  int sum(int a , int b, int c){
        return a+b+c;
    }
}
