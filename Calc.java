// import Scanner class
import java.util.Scanner;

// create my public class
public class Calc 
{
    // create my main method
    public static void main(String[] args)
    {
        // create some memory locations (variables)
        double num;
        double num2;
        double num3;
        double num4;
        double sum;
        double avg;

        // initialize keyboard object for user input
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to input test grades
        System.out.print("ENTER test one average: ");
        num = keyboard.nextDouble();
        System.out.print("ENTER test two average: ");
        num2 = keyboard.nextDouble();
        System.out.print("ENTER test three average: ");
        num3 = keyboard.nextDouble();
        System.out.print("ENTER test four average: ");
        num4 = keyboard.nextDouble();

        // Calculate average of all tests
        sum = num + num2 + num3 + num4;
        avg = sum/4;

        // Display average and only have two decimal places
        System.out.print("\nClass average: ");
        System.out.printf("%.2f", avg);
    }
}