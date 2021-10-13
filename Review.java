import java.util.Scanner;

public class Review
{
    public static void main(String[] args)
    {
        // create keyboard object
        Scanner keyboard = new Scanner(System.in);

        // variable to hold user input
        int ans;

        // create a decision structure on whether user pefers paying debit, credit, or cash
        // Three diffent types of loops (forloop, whileloop, dowhileloop)
        // For loop: when we know how many iterations we want the loop to do
        // While loop: don't know how many iterations, and we check our boolean statement before we loop
        // Do-while loop: theres at least one iteration, and we check our boolean statement after we loop
        do{
        System.out.println("What is your preferred payment type?: ");
        System.out.println("1. Debit \n2. Credit \n3. Cash");
        System.out.print("\nENTER 1-3: ");
        ans = keyboard.nextInt();
        }while(ans != 1 && ans != 2 && ans != 3);

        // create our decision structure
        if(ans == 1)
        {
            System.out.println("SWIPE your debit card");
        }
        else if(ans == 2)
        {
            System.out.println("SWIPE your credit card");
        }
        else if(ans == 3)
        {
            System.out.println("ENTER your cash here");
        }
    }
}