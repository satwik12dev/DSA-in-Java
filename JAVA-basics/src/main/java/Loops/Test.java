package Loops;

public class Test {
    public static void main(String[] args) {
        //Loops --> While Loop
        //          Do While loop
        //          For Loop

        //While loop
        int i =0;
        while (i<10){
            System.out.println("Hello World");
            i+=1;
        }

        while (i<=50){
            System.out.println(i);
            i++;
        }

        //Do While loop
        int i2 = 0;
        do{
            System.out.println(i);
            i2++;
        }while (i2<=50);

        //For Loop

//        for(initialisation;condition;update){}

        for(int i1=1;i1<=10;i1++){
            System.out.println(i);
        }
    }
}
