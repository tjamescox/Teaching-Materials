public class Factorial
{
    // recursively find the factorial of an integer value
    // example: int = 5 ---->  5*4*3*2*1 = answer
    public static int factorial(int n)
    {
        if(n > 1)
        {
            return n * factorial(n - 1);
        }
        else // base case: very important
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(factorial(3));
        System.out.println(factorial(10));
    }
}