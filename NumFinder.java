// program that gets three numbers from the user and finds the largest/smallest one
// Author: Tanner Cox

import java.util.Scanner;

public class NumFinder
{
    public static void main(String[] args)
    {
        // initialize our variables
        int input1;
        int input2;
        int input3;

        // create our keyboard object
        Scanner keyboard = new Scanner(System.in);

        // Prompt user to input numbers
        System.out.print("ENTER whole number: ");
        input1 = keyboard.nextInt();
        System.out.print("ENTER whole number: ");
        input2 = keyboard.nextInt();
        System.out.print("ENTER whole number: ");
        input3 = keyboard.nextInt();

        // create our decision struction for largest number
        if(input1 > input2 && input1 > input3)
        {
            System.out.println("\n" + input1 + " is the largest number");
        }
        else if(input2 > input1 && input2 > input3)
        {
            System.out.println("\n" + input2 + " is the largest number");
        }
        else if(input3 > input2 && input3 > input1)
        {
            System.out.println("\n" + input3 + " is the largest number");
        }

        // create our decision struction for smallest number
        if(input1 < input2 && input1 < input3)
        {
            System.out.println("\n" + input1 + " is the smallest number");
        }
        else if(input2 < input1 && input2 < input3)
        {
            System.out.println("\n" + input2 + " is the smallest number");
        }
        else if(input3 < input2 && input3 < input1)
        {
            System.out.println("\n" + input3 + " is the smallest number");
        }
    }
}