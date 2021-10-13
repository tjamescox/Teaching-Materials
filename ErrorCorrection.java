public class Bad Example // -----> public class BadExample
{
    public void static main(String[] args) // ----> public static void main(String[] args)
    {
        System.out.println(Hello World);  // ----> System.out.println("Hello World");
        System.out.print("What's " up)    // ----> System.out.print("What's up");
        Sysem.out.print("I'm good");      // ----> System.out.print("I'm good");

        int i = 90;      // this is correct
        z = i + 20;      // int z = i + 20;

        else             // create if statement instead of else
            z = i + 25;  // this is correct because we fixed int z above

        if (z > i)  // no errors
        {
           System.out.print("z > i");   // no errors
                // else
                  // System.out.print("z < i"); // else statement located in if block statement, needs to be taken out
        }
        else
            System.out.print("z < i"); // ----> this is correct
    } // <--- added this for our last error 
} 