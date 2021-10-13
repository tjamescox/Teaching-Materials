// powers of 2 table using a while loop
// Author: Tanner Cox

import java.lang.Math;

public class PowerTwo
{
    public static void main(String[] args)
    {
        // variables
        double two = 2;
        double answer;
        double counter = 0;

        while(counter <= 10)
        {
            answer = Math.pow(two, counter);
            System.out.println("2^" + counter + " = " + answer);
            counter++;
        }
    }
}