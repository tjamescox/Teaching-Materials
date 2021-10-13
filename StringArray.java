// practice with arrays, String arrays

import java.util.Scanner;

public class StringArray
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // arrays have indexes ----> [0][1][2][3][4][5][6][7]

        // intialize array
        // when you know what values go into the array
        String[] sentence = {"Hello", "how", "are", "you", "?", "Beutiful", "day", "!"};

        // check indexes in array
        System.out.println(sentence[0]);
        System.out.println(sentence[1]);
        System.out.println(sentence[2]);
        System.out.println(sentence[3]);

        // for loop to print out our sentence
        for(int i = 0; i < sentence.length; i++)
        {
            System.out.print(sentence[i] + " ");
        }

        keyboard.nextLine();

        // initialize another String array
        // dont know wat values go into the array, get user input
        String[] names = new String[5]; // <--- have to include the size of array

        // user input for names
        for(int k = 0; k < names.length; k++)
        {
            System.out.print("ENTER name: ");
            names[k] = keyboard.nextLine();
        }

        // display names in array
        for(int m = 0; m < names.length; m++)
        {
            System.out.println(names[m]); // <--- display values at index m
        }

        // search through the array to find the index that "Tanner Cox" <-- include this in user input
        for(int v = 0; v < names.length; v++)
        {
            if(names[v].equals("Tanner Cox"))
                System.out.println("Index: " + v);
        }
    }
}