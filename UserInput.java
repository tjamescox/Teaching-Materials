import java.util.Scanner;

// program that gets user data (int and double) used for calculation

public class UserInput
{
    public static void main(String[] args)
    {
        // initialize our variables
        int num1;
        int num2;
        double num3;
        double num4;

        // get user input
        Scanner keyboard = new Scanner(System.in);

        // prompt user to input data
        System.out.print("ENTER whole number: ");
        num1 = keyboard.nextInt(); // <--- Use .nextInt() for integer values
        System.out.print("ENTER whole number: ");
        num2 = keyboard.nextInt();
        System.out.print("ENTER decimal number: ");
        num3 = keyboard.nextDouble(); // <---- Use .nextDouble() for double values
        System.out.print("ENTER decimal number: ");
        num4 = keyboard.nextDouble();

        // multiply the integers and doubles by each other
        int number = num1 * num2;
        double number2 = num3 * num4;

        // display the results
        System.out.println(num1 + " x " + num2 + " = " + number);
        System.out.println(num3 + " x " + num4 + " = " + number2);
    }
}