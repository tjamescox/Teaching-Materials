 /**
 This program will show the intital of the State
 Step 1 Promo the user to ask for the state
 Step 2 promo the computer to see what initals for those
 Step 3 Promo the computer to put in to a initals of the state
 @Authour Alena Welch
 @version 1.1
 **/
 
 import java.util.Scanner;
 public class StatesIntials
 {
  public static void main(String [] args) 
  {
   String Statename;//will get the user input

   Scanner keyboard = new Scanner (System.in);// the will get access to the user to there keyboard.
     
   System.out.println("Enter a State: ");// Promo the user of the state
	  
   Statename = keyboard.nextLine();// The user input of the state name
	  
   System.out.println("\nInput: "+Statename);// Given out of state name
	
	System.out.println("\nOutput: "+Statename.toUpperCase().substring(0,1)
	                    +"."+Statename.toUpperCase().substring(6,7));// print the state Intials which are capitzled.
  
   }//end of Main
}//end of class