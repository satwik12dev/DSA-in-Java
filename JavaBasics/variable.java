package JavaBasics;
public class variable {
    public static void main(String[] args) {
       //integral number
       // byte long short int

       byte age1 = 127;
       short age3 = 30;
       int age = 10;
       long age4 = 400000000000000l;

       System.out.println(Long.MIN_VALUE);
       System.out.println(Long.MAX_VALUE);




        // decimal numbers
        // float
       float age2 = 1000000.5623556963693f;
       double age5 = 1000000.5623556963693;

       age2=10555555555500.1111123111212121f;
       age5=10555555555500.1111123111212121;
       System.out.println(age2);
       System.out.println(age5);






       //characters
       char ch = 'A';

       char heart = 10084;
       System.out.println(heart);

       char snowflake = '\u25B4';// unicode representation
       System.out.println(snowflake);

       char hindichar = 2309;
       System.out.println(hindichar);

       for(int i=0;i<128;i++){
           System.out.println(i+" "+(char)i);
       }


        // boolean
       boolean isMarried = true;


       byte byteValue = 10;//1
       short shortValue = byteValue; //2
       int intvalue = 10;//4
       long longvalue = intvalue; //8
       float floatvalue = longvalue;//4
       double doublevalue = floatvalue;//8


       System.out.println("int:"+intvalue);
       System.out.println("Long:"+longvalue);
       System.out.println("Float:"+floatvalue);
       System.out.println("Double:"+doublevalue);
    // WIDEING Conversion or implicit conversion or automatic conversion
       char charValue = 'A';
       int intCharValue = charValue;
       float floatCharValue = intCharValue;
       System.out.println("int:"+intCharValue);
       System.out.println("float:"+floatCharValue);



    // narrowing conversion
   double doublevalue2 = 123.456;
   float floatvalue2 = (float)doublevalue2;
   long longvalue2 = (long)floatvalue2;
   int intvalue2 = (int)longvalue2;
   short shortvalue2 = (short)doublevalue2;

   System.out.println(intvalue2);
   System.out.println(shortvalue2);
   System.out.println(doublevalue2);
   System.out.println(longvalue2);
   System.out.println(floatvalue2);


    long a = Long.MAX_VALUE;
    System.out.println(a);
    int b = (int)a;
    System.out.println(b);
    }
}