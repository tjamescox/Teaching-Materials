// program that takes an existing array, copies the values backwards into new array
// [34][41][53][65][76] ----->  [76][65][53][41][34]

import java.util.Scanner;

public class BackwardsArr
{
    public static void main(String[] args)
    {
        // declare our arrays
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int counter = 0;

        // keyboard object
        Scanner keyboard = new Scanner(System.in);

        // user input
        for(int i = 0; i < array1.length; i++)
        {
            System.out.print("ENTER a number: ");
            array1[i] = keyboard.nextInt();
        }

        // copy array backwards
        for(int k = array2.length - 1; k >= 0; k--)
        {
            array2[k] = array1[counter];
            counter++;
        }

        // Display our arrays
        for(int p = 0; p < array1.length; p++)
        {
            System.out.print(array1[p] + " "); 
        }

        System.out.print("\n"); // goes to next line

        for(int w = 0; w < array2.length; w++)
        {
            System.out.print(array2[w] + " ");
        }
    }
}