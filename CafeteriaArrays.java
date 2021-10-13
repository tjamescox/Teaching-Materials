import java.util.Scanner;

public class CafeteriaArrays {

/**
* @param args the command line arguments
*/

public static void main(String[] args) {
// TODO code application logic here
final int Days = 5;
String[]entrees = new String[Days];
double[]prices = new double[Days];
Scanner Keyboard = new Scanner(System.in);
String []daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
for(int index = 0; index < Days; index++)
{
System.out.println("Enter the dish being served on " + daysOfWeek[index] );
entrees[index] = Keyboard.nextLine();
}

for(int index = 0; index < Days; index++)
{
System.out.println("Entre the prices for the " + entrees[index] + ":" );
prices[index] = Keyboard.nextDouble();
}
System.out.println("Prices for the dishes you entered here : ");
for(int index = 0; index < Days; index++)
{ System.out.println("The price for the" + " " + entrees[index] + " " + "is" + " " + "$"+ prices[index] );
}
for(int index = 0; index < Days; index++)
{ System.out.println("The dish is served on " + daysOfWeek[index] + " "+ "is" + " " + entrees[index] + " for the price of " + "$" + prices[index]);
}
Keyboard.nextLine();


System.out.println("Enter the name of the dish you want !");
String entry = Keyboard.nextLine();


for(int index = 0; index < Days; index++)
{
    if(entry.equals(entrees[index]))
        System.out.println("Your entree is served on " + daysOfWeek[index]);
}
int foundIndex = 0;
double highestValue = 0.0;
for(int index = 0; index < Days; index++)
if(prices[index] > highestValue)
{
foundIndex = index;
highestValue = prices[index];
}

System.out.println("The highest priced item is "+ entrees[foundIndex] + " for the price of " + prices[foundIndex]);

}
}