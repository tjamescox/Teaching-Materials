// Practice for getting user input (get two int values and mult/add them together)
// Author: Tanner Cox
// Algorithm:
// Step One: import Scanner class
// Step Two: create public class UserNum
// Step Three: create main method
// Step Four: initialize our variables
// Step Five: create our keyboard object (CANT get user input without it)
// Step Six: prompt the user to input two WHOLE numbers
// Step Seven: add and multiply user input
// Step Eight: display sum and product

import java.util.Scanner; // REMEMBER FOR TEST ONE!!!  This is a bridge between keyboard and program

public class UserNum
{
    // create main method (REMEMBER FOR TEST ONE!!!)
    public static void main(String[] args)
    {
        // initialize our variables
        int num1;
        int num2;
        int sum;
        int product;

        // create keyboard object
        Scanner keyboard = new Scanner(System.in); // REMEMBER FOR TEST ONE!!!

        // prompt user for user input
        System.out.print("ENTER whole number: ");
        num1 = keyboard.nextInt();
        System.out.print("ENTER whole number: ");
        num2 = keyboard.nextInt();

        // get our calculations
        sum = num1 + num2; // add values together
        product = num1*num2; // multiply values

        // display product and sum
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " x " + num2 + " = " + product);
    }
}