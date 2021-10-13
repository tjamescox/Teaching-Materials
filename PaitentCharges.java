  import java.util.Scanner;
  /*
  This is a program will show the Patient information, the three produce,and total charges of three produce.
  Step 1 Promo the user to ask the patient thier first,Middle,Last Name.
  Step 2 Promo the user to ask the patient for thier Address
  Step 3 Promo the user to ask the patient for the City they are living at
  Step 4 Promo the user to ask the patient for the five digits of  thier Zip Code.
  Step 5 Promo the user to ask the patient thier  Ememgery contact 
  Step 6 Promo the user to ask the patient thier phone number with dashes 
  Step 7 Promo the user to ask the patient thier Emegracy contract full name.
  Step 8 Promo the user to ask the patient thier Emegracy contract phone number also with dashes.
  Step 9 Promo the user to ask the doctor about the produce name.
  Step 10 Promo the user to ask the doctor about today date either the full day in words or numbers.
  Step 11 Promo the user to ask the docotr the practitioner name.
  Step 13 Promo the user to ask the docotr how much for the produce.
  Step 14 Add all the charges for all the charges to see how much it cost.
  @authour Alena Welch
  @version 1.1
 */
  public class PaitentCharges{
	 public static void main(String [] args) {
     Scanner keyboard = new Scanner (System.in);
     
     // promt the user to input information
     
	 Patient P = new Patient("Alena","Joi","Welch","3741 Caseys Cove", "Ellenwood","30294","678-826-8696","Renee Chavers","404-307-6754");
	 Produce Pd = new Produce("Physical Exam","Today's Date","Dr.Irvine",250.00);// this will show the first 
	 Produce Pd1 = new Produce("X-ray","Today's Date","Dr.Jamison",500.00);
	 Produce Pd2 = new Produce("Blood Test","Today's Date","Dr.Smith",200.00);
	
	 
	 System.out.println(P.toString());
	
	 System.out.println("\nProcedure #1: ");
	 System.out.println(Pd.toString());

	 System.out.println("\nProcedure #2: ");
	 System.out.println(Pd1.toString());
	   
	 System.out.println("\nProcedure #3: ");
	 System.out.println(Pd2.toString());

	 double Sum = 500.00+ 200.00+250.00;
	 System.out.printf("\nAll of the Produces Charges will be: $%2.2f", Sum);
	 
 }
 }