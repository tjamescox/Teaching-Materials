// Study guide for test #2

import java.util.Scanner;

public class StudyGuide2
{
    public static void main(String[] args)
    {
        // Loops
        // For, Do while, while
        // For loop, use when you know how many iterations there will be (pre-test) also works well with arrays
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Index = " + i);
        }

        // While loop, use this when you don't know how many iterations you will go through (pre-test)
        // in this example, because it's a pre-test loop it doesn't iterate at all
        boolean whileEx = true;

        // example of infinite loop
        // while(whileEx == true)
        // { ......... }

        while(whileEx == false)
        {
            System.out.println(" ........ ");
        }

        // Do while loop, use this when we need to do a process at least once (post-test)
        Scanner keyboard = new Scanner(System.in);
        String ans;

        do{
            System.out.print("ENTER Yes/No, do you want to iterate again?: ");
            ans = keyboard.nextLine();
        }while(ans.equals("Yes") || ans.equals("yes"));

        // Enhance For Loop, use with arrays because it iterates through entire array
        String[] names = {"Tanner", "William"};
        for(String output: names)
        {
            System.out.println(output);
        }

        // Arrays, helps store multiple things in one location on your computer
        int[] array1 = {34, 23, 54, 65, 76, 87, 45}; // length of array1 = 7, maxIndex of array1 = 6
        String[] array2 = new String[4]; // Fill the array with user input, search through array for certian value
        int sum = 0;
        int average;

        for(int k = 0; k < array1.length; k++)
        {
            sum += array1[k]; // accumulator operator
        }

        System.out.println("Sum of array1 = " + sum);
        average = sum / array1.length;
        System.out.println("Average of array1 = " + average);

        // get user input to store into an array
        for(int m = 0; m < array2.length; m++)
        {
            System.out.print("ENTER name: ");
            array2[m] = keyboard.nextLine();
        }

        // search through array to find "Tanner" return what index they are at
        for(int n = 0; n < array2.length; n++)
        {
            if(array2[n].equals("Tanner"))
                System.out.println("Tanner was found at index " + n);
        }
    }
}