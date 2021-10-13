import java.util.Scanner;
public class Cafeteria {
	public static void main(String args[]) {
		
		final int DAYS = 5;
		
		double[] entreeCost= new double[5];
		
		Scanner keyboard = new Scanner(System.in);
		
		// Ask user for entre
		String[] everydayEntrees = new String[5];
		
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
	
		
		System.out.println("Days of the week:");
		
		for (int index = 0; index < DAYS; index++)
			System.out.println("Day" + (index+1) + " " + days[index]);
		
			for (int index = 0; index < everydayEntrees.length; index++ ) {
		System.out.println("Please enter meal for " + days[index] + ": ");
		everydayEntrees[index] = keyboard.nextLine();
		
	}
			for (int index =0; index < everydayEntrees.length; index++)
				System.out.println(everydayEntrees[index]);
			
			//prompt user to enter prices
			System.out.println("Please enter prices:");
			
			//input taken from user for entre prices
			for (int index = 0; index < DAYS; index++)
			{
				System.out.println(everydayEntrees[index] + ":");
				entreeCost[index] = keyboard.nextDouble();
			}

        // TO DO:  Find the entree with the highest price
        // Algorithm:
        // 1. Create a double variable, can name it max, then set max to the first index of entreeCost[0] array
        // 2. Create for loop to search through the entreeCost array for highest price
        // 3. Within for loop create decision structure ---> if(max < entreeCost[index]) 
        //          if max variable is less than entreeCost[index] then max = entreeCost[index]
        //          THIS MAY BE BETTER: create an int variable to store index of entree with highest cost
        //          Use that int variable to display the entree and day the most expensive entree is served (indexes match up for all arrays)
        // 4. Hop out of for loop and print out the entree with the highest cost
    }
}