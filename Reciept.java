import java.util.Scanner;

public class Reciept
{
    public static void main(String[] args)
    {
        // keyboard object
        Scanner keyboard = new Scanner(System.in);

        // initialize varibles
        int numChips;
        double priceChips = 1.99;
        double totalPrice; 
        double tax = 1.07;

        // prompt the user to input the number of chips they want
        System.out.print("How many chips do you want?: ");
        numChips = keyboard.nextInt();

        // calculate total price
        totalPrice = numChips*priceChips*tax;

        System.out.println("\nWELCOME TO QUICKTRIP"); // <------ \n is next line
        System.out.println(numChips + " x $" + priceChips + " Potato Chips");
        System.out.print("Total price: $");
        System.out.printf("%.2f", totalPrice);
        System.out.println("\nPLEASE COME COME AGAIN"); // <---- \t is tab
    }
}