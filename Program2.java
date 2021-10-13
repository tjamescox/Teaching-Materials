	//import scanner class
	import java.util.Scanner;
	//create public class
	public class calorieCalculator {
	//create main method
		public static void main(String[] args) {
	//initialize variables
	double metabolicRate;
	int weight;
	double height;
	int age;
	char gender;
	int exerciseDays;
	double calories;
	int meals;
	
	//provide keyboard for user to input values 
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter age");
	age = keyboard.nextInt(); // <---- get the user input for the rest of the values like this
	System.out.print("Enter height");
	// height = user input on keyboard *TO DO*
	System.out.print("Enter weight");
	// weight = user input on keyboard *TO DO*
	System.out.print("Enter gender");
	gender = keyboard.nextChar();
	
	System.out.print("Enter exercise days");
	// exerciseDays = user input on keyboard *TO DO*
	
	//Create if else for metaolic rates
	if (gender.equals('M')   
	{metabolicRate = 665+(6.23 * weight)+(12.7 * height)-(6.8 * age);}
	else {metabolicRate = 665+(4.35 * weight)+(4.7 * height)-(4.7 * age);}
	
	//Create if/else for days of exercise
	if (exerciseDays==0) {calories = metabolicRate * 1.2;}
	else if (exerciseDays>=1 && exerciseDays <=3) {calories = metabolicRate * 1.375;}
	else if (exerciseDays >=4 && exerciseDays <=5) {calories = metabolicRate * 1.55;}
	else if (exerciseDays >=6 && exerciseDays <=7) {calories = metabolicRate * 1.725;}
	else {calories = metabolicRate * 1.9;}
	
	//create a loop for user to input value of calories of snacks or meals
	do {
		System.out.println("Enter number of calories in snack or meal");
		calories++;
	} while (calories <= );
	}
}
}
	