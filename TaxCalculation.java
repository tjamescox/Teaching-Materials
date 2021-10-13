/* Kiana Forbes
CSCI 1302 
*/
import java.util.Scanner;
public class TaxCalculation {
 public static void main(String[] args){
 //Scanner Object
 Scanner scanner = new Scanner(System.in);
 //Loop variable
 do{
 double withheldtax;
 double income;
 double tax;
 boolean single;
 boolean married;
 
 //Prompt User to enter their income,withehld tax, and filling status
 System.out.println("What is your yearly income?");
 income = scanner.nextDouble();
 System.out.println("What is your witheld taxes?");
 withheldtax = scanner.nextDouble();
 System.out.println("Did you file your status as single? true or false");
 single = scanner.nextBoolean();
 System.out.println("Did you file your status as married? ture or false");
 married = scanner.nextBoolean();
 tax = scanner.nextDouble();
 
 //If else Statements
 if (single == true)
 {
  if (income>=9526 && income < 38700);
 
  tax = 0.12 * income;
  if(tax<=withheldtax)
  {
   System.out.println("overpaid");
   }
    else if (tax > withheldtax)
   {
    System.out.println("underpaid");
    }
  if (single ==true)
  {
  if (income >= 9256 && income < 38700) {
    tax = 0.12 * income;
    System.out.println(tax);
    }
    else if (income >= 38701 && income < 82500) {
    tax = 0.22 * income;
    System.out.println(tax);
    }
    else if (income >= 82501 && income < 157500) {
    tax = 0.24 * income;
    System.out.println(tax);
    }
    else if (income >= 157501 && income < 200000) {
    tax = 0.32 * income;
    System.out.println(tax);
    }
    else if (income >= 200000) {
    tax = 0.39 * income;
    System.out.println(tax);
    {
     if (tax <= withheldtax) 
   {   
   System.out.println("overpaid");
   }
    else if (tax > withheldtax)
   {
    System.out.println("underpaid");
    }
    else if (married ==true)
    {
     if( income >= 19051 && income < 77400) {
     tax = 0.12 * income;
     System.out.println(tax);
     }
     else if (income >= 77401 && income < 165000) {
     tax = 0.22 * income;
     System.out.println(tax);
     }
     else if (income >= 165001 && income < 315000) {
     tax = 0.24 * income;
     System.out.println(tax);
     }
     else if (income >= 315001 && income < 400000) {
     tax = 0.32 * income;
     System.out.println(tax);
     }
     else if (income >= 400000) {
     tax = 0.39 * income;
     System.out.println(tax);
     }
     else if( tax <= withheldtax) {
     
     System.out.println("overpaid");
     }
    else if (tax > withheldtax)
   {
    System.out.println("underpaid");
    }
 }
  System.out.println("Would you like to repeat? Y/N"); // changed user input to either Y/N
  String answer = scanner.nextLine(); // needed to initialize answer variable
  boolean tryAgain = true;
  if(answer.equals("Y") || answer.equals("y"))
      tryAgain = true;
  else
      tryAgain = false;
  
  }// Code is finished
 }
 }
}}while(tryAgain = true); // added a few closing brackets and while statement for do/while
 } // end of main method
} // end of class TaxCalculation
 
 