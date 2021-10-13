// write a program that fills an array with user input then copies it to another array

import java.util.Scanner;

public class CopyArray
{
    public static void main(String[] args)
    {
        // declare my keyboard object
        Scanner keyboard = new Scanner(System.in);

        // declare our arrays
        String[] names = new String[6]; // length = 6.... but, the maxIndex = 5
        String[] copyNames = new String[6];

        // prompt the user to input names into names array
        for(int i = 0; i < names.length; i++)
        {
            System.out.print("ENTER name: ");
            names[i] = keyboard.nextLine(); // Tanner ---> .charAt(1); = a
        }

        // copy the values in names[] to copyNames[]
        for(int k = 0; k < copyNames.length; k++)
        {
            copyNames[k] = names[k];
        }

        // display the values of copyNames
        for(int j = 0; j < copyNames.length; j++)
        {
            System.out.println(copyNames[j]);
        }
    }
}