import java.util.Random;

public class MathPractice
{
    public static void main(String[] args)
    {
        int x = 86;
        int y = 25;
        int z = 99;
        int sum;
        int product;

        final double p = 110;
    

        if(x == y) // == is seeing if they share the same values (true/false)
          System.out.print("Whatever");

        x = y + z; // after this line of code x = 124 no longer equal to 86
        x = y; // after this x = 25

        Random r = new Random();
        int i = r.nextInt(100); // generate random number 1 - 100

        if(i%2 != 0) // if odd number....  uses modulus math i%2 (divide i by 2, remainder is the answer)
           System.out.println("Computer turn");
        else // if even number
           System.out.println("Users turn");
    }
}