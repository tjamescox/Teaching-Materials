// Author: Tanner Cox

import java.util.Scanner; // So we can get user input

public class GetAvg
{
    public static void main(String[] args)
    {
        // create variables
        double test1;
        double test2;
        double finalExam;
        double average;

        // create a keyboard object
        Scanner keyboard = new Scanner(System.in); // know this memory

        // Prompt the user for test averages
        System.out.print("ENTER test one average: ");
        test1 = keyboard.nextDouble();
        System.out.print("ENTER test two average: ");
        test2 = keyboard.nextDouble();
        System.out.print("ENTER final exam: ");
        finalExam = keyboard.nextDouble();

        // weighted average would be a different calculation:
        // test one (25%), test two (25%), final exam (50%)
        // average = test1*.25 + test2*.25 + finalExam*.5;
        average = (test1 + test2 + finalExam) / 3;

        System.out.println("The final grade is: " + average);
    }
}