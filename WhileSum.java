import java.util.Scanner;

public class WhileSum
{
    public static void main(String[] args)
    {
        // variables
        int ans1;
        int ans2;
        int sum;
        String answer = "no";

        // keyboard object
        Scanner keyboard = new Scanner(System.in);

        // do while loop
        do{
            System.out.print("ENTER number: ");
            ans1 = keyboard.nextInt();
            System.out.print("ENTER number: ");
            ans2 = keyboard.nextInt();

            // calculate sum
            sum = ans1 + ans2;
            System.out.println("Sum: " + sum);

            // prompt the user for yes/no
            System.out.print("\nDo you want to go again? (Yes/No): ");
            keyboard.nextLine(); // <---- buffer line
            answer = keyboard.nextLine();
        }while(answer.equals("Yes") || answer.equals("yes"));

        // while loop for same problem
        // while(answer.equals("Yes") || answer.equals("yes"))
        // {
        //     System.out.print("ENTER number: ");
        //     ans1 = keyboard.nextInt();
        //     System.out.print("ENTER number: ");
        //     ans2 = keyboard.nextInt();

        //     // calculate sum
        //     sum = ans1 + ans2;
        //     System.out.println("Sum: " + sum);

        //     // prompt the user for yes/no
        //     System.out.print("\nDo you want to go again? (Yes/No): ");
        //     keyboard.nextLine(); // <---- buffer line
        //     answer = keyboard.nextLine();
        // }
    }
}