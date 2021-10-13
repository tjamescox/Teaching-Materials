// Create a program that finds grade point average and determines if you have an A,B,C,D,F
// Author: Tanner Cox

import java.util.Scanner;

public class DefineGrade
{
    public static void main(String[] args)
    {
        // initialize my variables
        double test1;
        double test2; 
        double test3;
        double average;

        // create keyboard object
        Scanner keyboard = new Scanner(System.in); // <--- Know to test one

        // prompt user to input test grades
        System.out.print("ENTER test one grade: ");
        test1 = keyboard.nextDouble();
        System.out.print("ENTER test two grade: ");
        test2 = keyboard.nextDouble();
        System.out.print("ENTER test three grade: ");
        test3 = keyboard.nextDouble();

        // calculate the average of tests
        average = (test1 + test2 + test3) / 3;
        
        // Decision Structures (if/else statements)
        if(average >= 90)
        {
            System.out.println("\nStudent has an A in the class.");
        }
        else if(average >= 80 && average < 90)
        {
            System.out.println("\nStudent has a B in the class.");
        }
        else if(average >= 75 && average < 80)
        {
            System.out.println("\nStudent has a C in the class.");
        }
        else if(average >= 65 && average < 75)
        {
            System.out.println("\nStudent has a D in the class.");
        }
        else
        {
            System.out.println("\nStudent has a F in the class.");
            System.out.println("See me after class.");
        }
    }
}