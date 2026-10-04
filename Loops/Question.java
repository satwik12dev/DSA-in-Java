package Loops;

public class Question {
    public static void main(String[] args) {
        /*
        *   1
        *   10
        *   100
        *   1000
        *   10000
        *   100000
         */

        for(int i=1,j=1; j<=6; i*=10,j++){
            System.out.println(i);
        }

        for(int i=1;i<=10;i++){
            System.out.println(i*7);
        }

        //sum of n natural numbers
        int sum =0;
        int i =1;
        while(i<=10){
            sum +=i;
            i++;
        }
        System.out.println(sum);

        //count digits of a number

        int num = 46734633;
        int res = 0;
        while(num>0){
            num = num/10;
            res++;
        }
        System.out.println(res);

        //Factorial
        int fact = 1;
        int n =6;

        while(n>0){
            fact *=n;
            n--;
        }
        System.out.println(fact);


        //Nested loop
        int r = 0;
        for(int i1=0;i1<10;i1++){
            for(int j=0;j<10;j++){
                System.out.println("Hello World");
                r++;
            }
        }
        System.out.println(r);

        /*
        * *
        * **
        * ***
        * ****
        * *****
        * ******
         */

        for(int i2=0;i2<10;i2++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //break and continue

        int i3=0;
        while(i3<1000){
            System.out.println(i3);
            if(i3==500){
                break;
            }
            i3++;
        }
        System.out.println("Hello");

        //Conitnue
        int i1=1;
        while(i1<=10){
            if(i1==5){
                i1++;
                continue;
            }
            System.out.println(i1);
            i1++;
        }
    }
}
