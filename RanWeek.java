// program that creates a random number 1-7 and displays the weekday 
// Author: Tanner Cox

import java.util.Random;

public class RanWeek
{
    public static void main(String[] args)
    {
        // randomly generate a number
        Random r = new Random();
        int day = r.nextInt(7) + 1;

        // create our decision structure
        if(day == 1)
        {
            System.out.println("The day is Sunday");
        }
        else if(day == 2)
        {
            System.out.println("The day is Monday");
        }
        else if(day == 3)
        {
            System.out.println("The day is Tuesday");
        }
        else if(day == 4)
        {
            System.out.println("The day is Wednesday");
        }
        else if(day == 5)
        {
            System.out.println("The day is Thursday");
        }
        else if(day == 6)
        {
            System.out.println("The day is Friday");
        }
        else
        {
            System.out.println("The day is Saturday");
        }
    }
}