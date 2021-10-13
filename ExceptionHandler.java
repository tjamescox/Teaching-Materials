// catch input mismatch exception when getting user input

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandler
{
    public static void main(String[] args)
    {
        // keyboard object
        Scanner keyboard = new Scanner(System.in);

        // initialize variable
        int answer;
        String[] array = new String[3];

        try{
            System.out.print("ENTER age: ");
            answer = keyboard.nextInt();
            System.out.print(array[10]); // expect array out of bounds exception
        }
        // catch(Exception e){
        //     System.out.println("Something went wrong");
        // }
        catch(InputMismatchException e){
            System.out.println("Input mismatch...  Recieved a String value, need integer value");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index 10 does not exist on array");
        }

        System.out.println("END OF PROGRAM");
    }
}