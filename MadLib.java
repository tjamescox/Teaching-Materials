import java.util.Scanner; // <--- remember this line of code!!!!

// Step one: Create a class
public class MadLib
{
    // Step two: create our main method
    public static void main(String[] args) // remember this line of code!!!
    {
        // Step three: initialize our variables 
        String noun;
        String pluralNoun;
        String verbPT;
        String verbPT2;
        String partOfBody;
        String adjective;
        String pluralNoun2;
        String adjective2;

        // Step four: get user input and initialize keyboard object
        Scanner keyboard = new Scanner(System.in); // remember this line of code!!!!

        // prompt the user to input certian pieces of data
        System.out.print("ENTER a noun: ");
        noun = keyboard.nextLine();
        System.out.print("ENTER a plural noun: ");
        pluralNoun = keyboard.nextLine();
        System.out.print("ENTER a verb (Present Tense): ");
        verbPT = keyboard.nextLine();
        System.out.print("ENTER a verb (Present Tense): ");
        verbPT2 = keyboard.nextLine();
        System.out.print("ENTER a part of the body (Plural): ");
        partOfBody = keyboard.nextLine();
        System.out.print("ENTER an adjective: ");
        adjective = keyboard.nextLine();
        System.out.print("ENTER a plural noun: ");
        pluralNoun2 = keyboard.nextLine();
        System.out.print("ENTER an adjective: ");
        adjective2 = keyboard.nextLine();

        // Step five: print out the results
        System.out.println("\nToday, every student has a computer small enough to fit into his");
        System.out.println(noun + ". He can solve any math problem by simply");
        System.out.println("pushing the computer's little " + pluralNoun + ". Computers");
        System.out.println("can add, multiply, divide, and " + verbPT + " better than a human. Some");
        System.out.println("computers are " + partOfBody + ". Others hava a/an");
        System.out.println(adjective + " screen that shows all kinds of " + pluralNoun2);
        System.out.println("and " + adjective2 + " figures.");
    } // end of main method
} // end of class MadLib