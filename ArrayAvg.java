// get user input for a bunch of double values in an array, find the sum and average
// Author: Tanner Cox

import java.util.Scanner;

public class ArrayAvg
{
    public static void main(String[] args)
    {
        // initialize my variables
        double sum = 0.0;
        double average;
        double[] array = new double[5];

        // keyboard object
        Scanner keyboard = new Scanner(System.in);

        // Get user input and store in array
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("ENTER a number: ");
            array[i] = keyboard.nextDouble();
        }

        // find sum
        for(int k = 0; k < array.length; k++)
        {
            // use accumulator to find sum
            sum += array[k];
        }

        // Display sum and average
        System.out.println("Sum: " + sum);
        average = sum / array.length;
        System.out.println("Average: " + average);
    }
} 