import java.util.Scanner;

public class Loop
{
    public static void main(String[] args)
    {
        // keyboard object
        Scanner keyboard = new Scanner(System.in);

        // for loop:  when we know how may iterations of the loop we need
        // pre test loop: it checks the for loop parameters to see if it's true before it iterates
        for(int i = 0; i < 5; i++)
        {
            System.out.println("TESTING: " + i);
        }

        // while loop:  when you don't know how many iterations there will be (pre test loop)

        boolean b = true;
        int counter = 0;

        while(b == true)
        {
            System.out.println("Testing 2: ");
            counter++;

            if(counter == 2)
            {
                b = false;
            }
        }

        // do while loop: when you know you need a minumum of one iteration
        // post test loop:  checks to see if the parameters are true after it iterates at least once

        int y = 0;
        boolean c = true;

        do{
            System.out.println("TESTING 3: ");
            y++;

            if(y == 3)
            {
                c = false;
            }
        }while(c == true);

        // ===================================================================================================
        // ===================================================================================================

        // Major function of the for loop (arrays)
        String[] names = new String[3]; // <--- initialized an array of Strings  [0][1][2] <-- Index of array
        names[0] = "Tanner Cox";
        names[1] = "Alexis Bennett";
        names[2] = "Nitika Bhandari";

        for(int j = 0; j < names.length; j++)
        {
            System.out.println(names[j]);
        }

        // Major funtion of while loop (user input)
        String answer;
        int test = 0;

        System.out.print("Do you have test grades to input? (Yes/No): ");
        answer = keyboard.nextLine();

        while(answer.equals("Yes") || answer.equals("yes"))
        {
            System.out.print("ENTER test grade: ");
            test = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Want to enter another value? (Yes/No): ");
            answer = keyboard.nextLine();
        }

        // Major function of do while loop (user input)
        do{
            System.out.print("ENTER test grade: ");
            test = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Want to enter another value? (Yes/No): ");
            answer = keyboard.nextLine();
        }while(answer.equals("Yes") || answer.equals("yes"));

        //===================================================================================================
        //===================================================================================================

        // additional practice do-while loop: when a user does not input the expected data values
        // this will keep looping as long as the user does not input Yes or No
        do{
            System.out.print("ENTER Yes or No: ");
            answer = keyboard.nextLine();
        }while(!answer.equals("Yes") && !answer.equals("No"));

    }
}