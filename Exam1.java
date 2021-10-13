// Study guide for exam 1

// Structure of a java program 
public class ClassName // outer shell of program
{
    public static void main(String[] args)
    {
        // instructions for computer go here
    }
}



// Variables vs. data types 
Data types: int, double, short, boolean, float, String
Variables: its an assigned name for a certian data type (ex. String name;) also like to think of them as memory locations



// Mathematical operators
int x = 50;
int y = 25;
int z;

z = x + y;
z = x * y; // all of these values are being stored in int z
z = x / y;

x += y; // <----- (x = x + y)
x /= y; // <----- (x = x/y)         all of these values are being stored in int x
x -= y; // <----- (x = x - y)



// Print methods
System.out.print(); // displays something but stays on the same line
System.out.println(); // displays something then skips to the next line ---
                      //                                                   |
                      //                                                 <-
System.out.printf("%.2f", double number); // print format, helps format decimal number



// Decision structures: if, else if, else
int temperature = 78;

if(temperature <= 100 && temperature >= 80)  // if the temperature is 80-100 degrees
{
    System.out.println("It's summertime");
}
else if(temperature <= 79 && temperature >= 60) // if the temperature is 60-79 degrees
{
    System.out.println("It's springtime");
}
else // everything elso other than 60-100 degrees
{
    System.out.println("It's not spring or summer")
}

// nested decision structure: if statement in an if statement
if()
{
    if()
}


// increment and decrement
int i = 9;
int j = 3;

i++; // post-increment:  adds 1 after it goes to the next line of code ---> j + i++ = 3 + 9 after this, i = 10
++i; // pre-increment: adds 1 immediately after reading line of code ---> j + ++i = 3 + 10
i--; // post-decrement: subtracts 1
--i; // pre-decrement: subtracts 1