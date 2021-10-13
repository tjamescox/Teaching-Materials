// program that determines how many days are in a certian month
// Author: Tanner Cox

import java.util.Scanner;

public class MonthDays
{
    public static void main(String[] args)
    {
        // initialize variable
        int answer;

        // initialize keyboard object
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to input the month
        System.out.print("ENTER a month (1-12): ");
        answer = keyboard.nextInt();

        // Create decision structure
        if(answer == 1)
            System.out.println("\nJanuary has 31 days");
        
        else if(answer == 2)
        {
            System.out.println("\nFebruary has 28 days (common year)");
            System.out.println("February has 29 days (leap year)");
        }

        else if(answer == 3)
            System.out.println("\nMarch has 31 days");

        else if(answer == 4)
            System.out.println("\nApril has 30 days");

        else if(answer == 5)
            System.out.println("\nMay has 31 days");

        else if(answer == 6)
            System.out.println("\nJune has 30 days");

        else if(answer == 7)
            System.out.println("\nJuly has 31 days");

        else if(answer == 8)
            System.out.println("\nAugust has 31 days");

        else if(answer == 9)
            System.out.println("\nSeptember has 30 days");

        else if(answer == 10)
            System.out.println("\nOctober has 31 days");

        else if(answer == 11)
            System.out.println("\nNovember has 30 days");

        else if(answer == 12)
            System.out.println("\nDecember has 31 days");

        else
            System.out.println("\nInvalid input, try again.");
    }
}