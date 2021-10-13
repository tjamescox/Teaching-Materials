import java.util.Scanner;

public class SearchArray
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;

        // create an array to search through
        String[] names = {"Tanner Cox", "William Carroll", "Jamar Sheffield" , "Javonte Carr"};

        // prompt user for name to search
        System.out.print("ENTER name: ");
        name = keyboard.nextLine();

        // for loop to search through the entire array
        for(int i = 0; i < names.length; i++)
        {
            if(name.equals(names[i]))
                System.out.println(names[i] + " is found at index " + i);
        }
    }
}