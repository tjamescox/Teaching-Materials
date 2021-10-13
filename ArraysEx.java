import java.util.Scanner;

public class ArraysEx
{
    public static void main(String[] args)
    {
        // keyboard object
        Scanner keyboard = new Scanner(System.in);

        // initialize name array
        String[] names = {"Tanner Cox", "William Carroll", "Jamar Sheffield" , "Javonte Carr"};
        // [Tanner Cox] [William Carroll] [Jamar Sheffield] [Javonte Carr]
        //  index = 0       index = 1         index = 2       index = 3

        // initialize age array and get user input for the ages of the people in names array
        int[] age = new int[4];

        for(int i = 0; i < age.length; i++)
        {
            // prompt user for ages of names
            System.out.print("\nAge of " + names[i] + ": ");
            age[i] = keyboard.nextInt();
        }

        // initialize hobbies array
        String[] hobbies = new String[4];
        hobbies[0] = "Drums"; // Tanner's hobby
        hobbies[1] = "Tennis"; // William's hobby
        hobbies[2] = "Piano"; // Jamar's hobby
        hobbies[3] = "Video Games"; // Javonte's hobby

        // display message of all arrays info
        for(int m = 0; m < names.length; m++)
        {
            System.out.println("\n" + names[m] + " is " + age[m] + " years old and plays " + hobbies[m] + ".");
        }
    }
}