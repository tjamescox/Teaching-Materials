import java.util.Scanner;

public class StudyWednesday
{
    public static void main(String[] args)
    {
        // Loops: for, while, do while
        // for loop:  use this when you know exactly how many iterations you need to do (pretest loop)
        for(int i = 0; i < 5; i++)
        {
            System.out.println("i = " + i);
        }

        // while loop: use this when we dont know how many iterations we will do (pretest loop)
        String ans = "No";
        Scanner keyboard = new Scanner(System.in);

        while(ans.equals("Yes") || ans.equals("yes")) // Does not iterate because ans == No
        {
            System.out.print("ENTER Yes/No: ");
            ans = keyboard.nextLine();
        }

        // do while:  use when you know you have to iterate a min of one time (posttest loop)
        do{
            System.out.print("Do you want to continue? Yes/No: ");
            ans = keyboard.nextLine();
        }while(ans.equals("Yes") || ans.equals("yes"));

        // Enhanced for loop: iterates through an entire array
        int[] array = {23, 34, 56, 67, 78, 45};

        for(int output: array) // for(dataType name: arrayName)
        {
            System.out.println(output);
        }

        // Arrays: Organize data and stores data together in the memory -----> [0][1][2][3]
        String[] names = new String[4]; // length of array = 4, maxIndex = 3

        for(int k = 0; k < names.length; k++)
        {
            System.out.print("ENTER name: ");
            names[k] = keyboard.nextLine();
        }

        // Search through array (searching for "Tanner")
        for(int l = 0; l < names.length; l++)
        {
            if(names[l].equals("Tanner"))
                System.out.println("Tanner is found at index " + l);
        }

        // Using accumulator to find the sum
        int sum = 0;
        int average;

        for(int m = 0; m < array.length; m++)
        {
            // sum = sum + array[m];
            sum += array[m];
        }

        System.out.println("Sum = " + sum);
        average = sum / array.length;
        System.out.println("Average = " + average);
    }
}