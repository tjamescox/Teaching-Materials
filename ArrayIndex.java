// this program will have multiple arrays...  The index of those arrays will be about a specific person
// example: info about Tanner will be found at index 0 of all arrays

import java.util.Scanner;

public class ArrayIndex
{
    public static void main(String[] args)
    {
        // declare arrays
        String[] names = {"Tanner Cox", "William Carroll", "Alexis Bennett", "Lauren Faulkner"};
        //            index =   0               1                 2                 3

        String[] favArtist = new String[4];
        favArtist[0] = "Anderson .Paak"; // Tanner's favorite artist
        favArtist[1] = "T.I."; // William's favorite artist
        favArtist[2] = "Kane Brown"; // Alexis' favorite artist
        favArtist[3] = "Giveon"; // Lauren's favorite artist

        // declare keyboard
        Scanner keyboard = new Scanner(System.in);

        // get user input for user's favorite food
        String[] food = new String[4];

        for(int i = 0; i < food.length; i++)
        {
            System.out.print("What is " + names[i] + "'s favorite food?: ");
            food[i] = keyboard.nextLine();
        }

        // print out all the values of our arrays
        for(int k = 0; k < names.length; k++)
        {
            System.out.println(names[k] + "'s favorite artist is " + favArtist[k] + " and favorite food is " + food[k]);
        }
    }
}