import java.util.Scanner;

public class Palindrome
{
    // write a recursive method that checks to see if a String is a palindrome (Examples: racecar, dad, mom, tenet)
    public static boolean palindromes(String s)
    {
        // base case
        if(s.length() == 1 || s.length() == 0)
            return true;

        if(s.charAt(0) == s.charAt(s.length() - 1)) // checking to see if the first and last letter are equal
            return palindromes(s.substring(1, s.length() - 1));

        return false;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // prompt user for word
        System.out.print("ENTER word: ");
        String ans = keyboard.nextLine();

        System.out.println("Is " + ans + " a palindrome?: " + palindromes(ans));

        // Lets say our String is racecar
        // Method call #1:  [r]aceca[r] ---> if letters in [][] match then palindromes("aceca")
        // Method call #2:  [a]cec[a] ---> palindromes("cec")
        // Method call #3:  [c]e[c] ---> palindromes("e")
        // Method call #4:  [e] --->  return true
    }
}