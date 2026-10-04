package IfElse;

import java.util.Scanner;

public class QuadrantFinding {
    public static void main(String[] args) {
        //Given a point (x, y), write a program
        //to find out if it lies in the 1st Quadrant,
        //2nd Quadrant, 3rd Quadrant, 4th
        //Quadrant, on the x-axis, y-axis or at the
        //origin.


        //approach --> for 1st Quadrant both x and y are positive
        //             for 2nd Quadrant y is positive, and x is negative
        //             for 3rd Quadrant both x and y are negative
        //             for 4th Quadrant x is positive and y is negative

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point x : ");
        int x = sc.nextInt();

        System.out.println("Enter point y : ");
        int y = sc.nextInt();

        if(x>0&&y>0){
            System.out.println("Point lies in Quadrant one");
        } else if (x<0 && y >0) {
            System.out.println("Point lies in Quadrant two");
        } else if (x<0 && y<0) {
            System.out.println("Point lies in Quadrant three");
        } else if (x>0 && y<0) {
            System.out.println("Point lies in Quadrant four");
        }
    }
}
