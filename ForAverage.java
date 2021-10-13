import java.util.Scanner;

public class ForAverage
{
    public static void main(String[] args)
    {
        // Variables
        double sum = 0;
        double average = 0; 

        // create a keyboard object
        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            System.out.print("ENTER test grade: ");
            sum += keyboard.nextDouble();
        }

        System.out.println("Sum: " + sum);
        average = sum / 5;
        System.out.println("Average: " + average);
    } 
}