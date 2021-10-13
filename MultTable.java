// Use a loop to print the multiplication table of a positive whole number given by user
// Author: Tanner Cox

import java.util.Scanner;

public class MultTable
{
    public static void main(String[] args)
    {
        // create keyboard object
        Scanner keyboard = new Scanner(System.in);

        // variables: named memory locations that hold certian data types 
        // Data types: Type of data on the computer (String, int, double, boolean)
        int answer;
        String name = "Tanner Cox";

        // prompt the user for whole number
        System.out.print("ENTER positive whole number: ");
        answer = keyboard.nextInt();

        // for loop
        for(int i = 0; i <= 12; i++) // increment: i++ ---> i + 1
        {
            System.out.println(answer + " x " + i + " = " + answer*i);
        }
    }
}