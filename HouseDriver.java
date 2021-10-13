import java.util.Scanner;

public class HouseDriver
{
    public static void main(String[] args)
    {
        // create my keyboard object
        Scanner keyboard = new Scanner(System.in);

        // set aside memory locations (variable) for user input
        double hRent;
        int bedroom;
        int bathroom;
        int squareFeet;
        String hAddress;

        // Prompt user to input values
        System.out.print("ENTER rent: ");
        hRent = keyboard.nextDouble();
        System.out.print("ENTER number of bedrooms: ");
        bedroom = keyboard.nextInt();
        System.out.print("ENTER number of bathrooms: ");
        bathroom = keyboard.nextInt();
        System.out.print("ENTER address: ");
        keyboard.nextLine(); // <--- Add this to your code
        hAddress = keyboard.nextLine();
        System.out.print("ENTER size of house (square feet): ");
        squareFeet = keyboard.nextInt();
        
        House newHouse = new House(hRent, bathroom, bedroom, squareFeet, hAddress);
        House house1 = new House(2500.00, 2, 3, 1300, "121 Place Drive");
        House house2 = new House(1500.00, 1, 2, 1000, "191 Elldale Drive");

        // display house object values
        System.out.println(newHouse.toString());

        // store our house objects in an array
        House[] array = new House[3];
        array[0] = newHouse;
        array[1] = house1;
        array[2] = house2;

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].getAddress());
        }
    }
}