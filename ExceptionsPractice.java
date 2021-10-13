import java.util.*;
import java.io.*;

public class ExceptionsPractice
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        // array out of bounds exception: looking for indexes of array that do not exist
        try{
        int [] array = new int[5]; // highest is 4
        System.out.println(array[10]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: Index 10 does not exist in array");
        }

        System.out.println("Program continues....");

        // input mismatch exception: user inputs wrong type of data
        try{
        int age;
        System.out.print("ENTER age: ");
        age = keyboard.nextInt();
        if(age < 18)
               throw new UnderageException("ERROR: Person is underage");
        } catch(InputMismatchException e){
            System.out.println("ERROR: Enter the age as number");
        } catch(UnderageException e){
            System.out.println("ERROR: Person is underage");
        }
            
        

        System.out.println("Program continues....");

        // file not found exception: computer cannot find file on your computer
        try{
            File inputFile = new File("file.txt");
            Scanner input = new Scanner(inputFile);
        } catch(FileNotFoundException e){
            System.out.println("ERROR: Cannot find file");
        }

        System.out.println("Program continues....");

        // finally clause: runs everytime the program runs
        try{
            double price = 0.0;
            System.out.print("ENTER price of item: ");
            price = keyboard.nextDouble();
        } catch(InputMismatchException e){
            System.out.println("ERROR: try again");
        } finally{
            System.out.println("FINALLY");
        }

    }
}

// Create personal exception by inheriting from the exception class
// Throw this exception then catch it 
// Example is found on lines 20 - 30
class UnderageException extends Exception
{
    // constructor method
    public UnderageException(String errorMessage)
    {
        super(errorMessage);
    }
}