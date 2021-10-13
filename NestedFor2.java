// get user input for test grades and find the average using nested for loop

import java.util.Scanner;

public class NestedFor2
{
    public static void getAvg()
    {
        // intialize variables
        String name;
        double sum = 0;
        double testScore;
        double average;

        // keyboard object
        Scanner keyboard = new Scanner(System.in);

        // nested for loop
        for(int i = 0; i < 2; i++)
        {
            System.out.print("ENTER name: ");
            if(i >= 1)
                keyboard.nextLine();
            name = keyboard.nextLine();

            for(int k = 0; k < 3; k++)
            {
                System.out.print("ENTER test score: ");
                testScore = keyboard.nextDouble();
                sum += testScore;
            }

            average = sum/3;
            System.out.print(name + " averaged ");
            System.out.printf("%.2f", average);
            System.out.println("%");
            sum = 0.0;
        }
    }

    public static void main(String[] args)
    {
        getAvg();
    }
}