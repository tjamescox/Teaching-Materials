import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        // keyboard object
        Scanner keyboard = new Scanner(System.in);
        String answer;
        boolean yesNo = true;
        String name;

        // Three different types of Loops: for loop, while loop, do-while loop

        // For loop (when you know how many iterations you need)
        for(int i = 0; i < 5; i++) // <---- incement (i++) i + 1
        {
            System.out.println("The value of i is: " + i);
        }

        // While loop (sometimes doesn't have to iterate, depends on the boolean statemant)
        // pre-determines if the loop will iterate 
        while(yesNo == true)
        {
            System.out.print("Do you want to keep looping? (Yes/No): ");
            answer = keyboard.nextLine();
            if(answer.equals("Yes"))
                yesNo = true;
            else
                yesNo = false;
            System.out.println("Iteration is done");
        }

        // Do-while loop (this loop iterates a minumum of one time)
        // post-determines if the loop iterate
        do{
            System.out.print("ENTER student name: ");
            name = keyboard.nextLine();

            System.out.print("Do you want to input another student name? (Yes/No): ");
            answer = keyboard.nextLine();
            if(answer.equals("Yes"))
                yesNo = true;
            else
                yesNo = false;
        }while(yesNo == true);
    }
}