public class Bitwise {
    public static void main(String[] args) {
        //computers => 01
        // operands --> byte short int long

        // And &
        // Or |
        // xor ^
        // not ~
        // left shift <<
        //right shift >>
        //unsigned right shift >>>

        int c = 5 & 4;
        System.out.println("******AND******");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(c);

        int d = 5 | 7;
        System.out.println("******OR******");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(d);

        int e = 5 ^ 7;
        System.out.println("******XOR******");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(e);


        int f = ~5;
        System.out.println("******NOT******");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(f);
        System.out.println(Integer.toBinaryString(f));


        int g = 5 << 1;
        System.out.println("******LEFT SHIFT******");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(g);
        System.out.println(Integer.toBinaryString(g));

        int h = 5 >> 1;
        System.out.println("******RIGHT SHIFT******");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(h);
        System.out.println(Integer.toBinaryString(h));

        int i = 5 >>> 2;
        System.out.println("******UNSIGNED RIGHT SHIFT******");
        System.out.println(Integer.toBinaryString(5));
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        
    }
}
