public class Operator {
    public static void main(String[] args) {
        //Addition
//        int a =5;
//        double c = a + 5.9;// literals
//        System.out.println(c);

//
//        float d = 12.5f;
//        long e = 23723;
//        float f = d + e; // precision loss
//        System.out.println(f);

        //Multiplication
//        int g = 438347634;
//        int i = g*24223;
//        long j = g*24223;
//        System.out.println(i);
//        System.out.println(j);
//
//        long h = 43569562;
//        long k = h*24223;
//        System.out.println(k);


        //Division
//        int a = 10;
//        int b = 3;
//        int c = a/b;
//        System.out.println(c);
//
//        double d = 10;
//        int e = 3;
//        double f = d/e;
//        System.out.println(f);
//
//        float g = 10.0f;
//        int h = 3;
//        float i = g/h;
//        System.out.println(i);
        // Devide by zero
//        int j = 2;
//        int k = j-2;
//        int l = j/k;
//        System.out.println(l);
//
//        int m = 2;
//        int n = j-2;
//        int o = m%n;
//        System.out.println(o);


        //Operator precedence
//        int a = 10;
//        int b = 5;
//        int r = a/b+3*2-1;
//        System.out.println(r);
//
//        int c = 10;
//        c +=1;//compound assignment operator
//        System.out.println(c);
//
//        byte d = 10;
//        d+=5; // error is not there because of compound assignment operator for implicit casting
//        System.out.println(d);


        //Increment and decrement operator
        int a = 99;
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);

        int b = 1;
//        int c = b++ + b;
//        System.out.println(c);
//        int d = ++b + b;
//        System.out.println(d);
//        int e = b + ++b;
//        System.out.println(e);
        System.out.println(b++ + --b);

        double x = 1.5;
        double y = 2.5;
        double z = 3.5;
        double complexCalculation = (x + y) * (z - y) / (x + z);
        System.out.println(complexCalculation);
    }
}