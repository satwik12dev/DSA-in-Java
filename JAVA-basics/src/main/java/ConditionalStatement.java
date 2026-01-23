public class ConditionalStatement {
    public static void main(String[] args) {
        // conditional statement

        //if else
//        int age =2;
//        if(age>=18){
//            System.out.println("You are eligible to vote");
//        }
//        else{
//            System.out.println("You are not eligible to vote");
//        }


//        int age = 50;
//        int marks = 35;
//        if(age<=18 && marks>=33){
//            System.out.println("Congrats");
//        }
//        else{
//            System.out.println("Bad luck");
//        }

//        if(true){
//            System.out.println("Hello World!!");
//        }


        //Multiple if else
        int marks = 75;
        //marks>=90 A
        //marks >=75 B
        // marks >=60 C
        // D
        if(marks>=90){
            System.out.println("A");
        } else if(marks>=75){
            System.out.println("B");
        } else if(marks>=60){
            System.out.println("C");
        } else{
            System.out.println("D");
        }


        //Switch Case --> byte short int char String enum types

        int day = 3;
        switch (day){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default: System.out.println("Invalid day");break;
        }

    }
}
