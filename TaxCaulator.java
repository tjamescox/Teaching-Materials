import java.util.Scanner;
	/**
This is a program is culcation your income tax
	Step 1 Promo the user to type in what is thier Filling Status
		Step 2 Promo the user to tpye in their income 
		Step 3 Promo the user to type in their  Withheld taxes
		Step 4 Caluation Filling Staus's income overpaid or underpaid's taxes by thier taxes rate
		Step 5 Calculates the tax by the taxe rates times the income
		Step 6 Combine the total taxes
		Step 7 Subtract Total taxes from Widthheld
		Step 8: repeat 1 to 7 until user dieced to stop.
 
      @authour Alena Welch
      @version 1.1
*/
public class TaxCaulator {
  public static void main(String [] args) {
	Scanner keyboard = new Scanner (System.in);
	double WidtheldTaxes = 0.0; // The interger is doble
  String FillingStuas = ""; // FillingStuas is a string that see the user staus
  String Yes = ""; // Yes is a string as respond
  String yes = "";// yes is a string as respond
  String Input = "";// Input is a string and answer input.
  double taxes = 0.0;//double taxes is doubles
  double Income = 0.0; // Double Imcome is double
  double RateHigh =0.0;// Double RateHigh is double
  double taxesRate = 0.0;// Double RateHigh is double
  double taxesRate2 = 0.0; // Double RateHigh is double
  double NetPay = 0.0;// Double RateHigh is double
  double taxesRate3 = 0.0;
  double  Paytaxes = 0.0;
  boolean married = false;
	double Yoy = 0.0; 
	  do {
	
  System.out.print("\nAre you married? (Y/N): ");
  FillingStuas = keyboard.nextLine( );// This Filling Stuas 
  if(FillingStuas.equals("Y") || FillingStuas.equals("y"))
      married == true;
  System.out.print("\nWhat is Your Income: ");
  Income = keyboard.nextDouble( );// Income : What user puts in.
  taxesRate = Income - 9526;// The taxes rates is the income subtract by 9,526
  System.out.print("\nWhat is Your Widtheld Taxes: ");
  WidtheldTaxes = keyboard.nextDouble( );//The user Wildheld taxes in.
  Input = keyboard.nextLine();//Input is what is given for the Widtheld taxes.
  if (taxesRate >= 9526 && taxesRate <= 38700 && married == false){
   Yoy = 9525;//90474
   taxesRate2 = Yoy*(0.12);
  } 
  else if (taxesRate >= 38701 && taxesRate <= 82500 && married == false){
   Yoy = (38700-9526);
   taxesRate2 = Yoy*(0.22);

  } else if (taxesRate >= 82501 && taxesRate <= 157500){
	 Yoy = (82500 - 38700);
        taxesRate2 = Yoy*(0.24);
  }else if (taxesRate >= 157501 && taxesRate <= 200000){
	Yoy = (157500-82501);
    taxesRate2 = Yoy*(0.32);
  } 
  else if (taxesRate > 200000){
      Yoy = 200000 - 157500;
      taxesRate2 = Yoy*.39;
  }
  else if (taxesRate >= 9526 && taxesRate <= 38700 && married == true){
    Yoy = 19051;//90474
    taxesRate2 = Yoy*(0.12);
   } 
   else if (taxesRate >= 38701 && taxesRate <= 82500 && married == true){
    Yoy = (77400-19051);
    taxesRate2 = Yoy*(0.22);
 
   } else if (taxesRate >= 82501 && taxesRate <= 157500){
      Yoy = (82500 - 3);
         taxesRate2 = Yoy*(0.24);
   }else if (taxesRate >= 157501 && taxesRate <= 200000){
     Yoy = (157500-82501);
     taxesRate2 = Yoy*(0.32);
   } 
   else if (taxesRate > 200000){
       Yoy = 200000 - 157500;
       taxesRate2 = Yoy*.39;
   }
  System.out.println(taxesRate2);
  System.out.println(Yoy);
  NetPay =  taxesRate - Yoy;//The net pay is the taxes subtract by WidtheldTaxes
  System.out.println(NetPay);
  if(NetPay >= 9526 && NetPay <= 38700)
      taxesRate3 = NetPay*.12;
  else if (NetPay >= 38701 && NetPay <= 82500)
	  taxesRate3 = NetPay*.22;
  else if (NetPay >= 82501 && NetPay<= 157500)
  taxesRate3 =  NetPay *.24;
  else if (NetPay >= 157501 && NetPay<= 200000)
	  taxesRate3 = NetPay*.32;
  else if (NetPay >= 200000)
  taxesRate3 = NetPay*.39;
  System.out.println(taxesRate3);
  taxes = taxesRate3+taxesRate2;// The taxes is add to from taxesRate+taxesRate2
  Paytaxes = taxes - WidtheldTaxes;
  if (WidtheldTaxes > taxes ){
			System.out.println("\nYou get a refund of : $"+Paytaxes);
    }else
	System.out.println("You get a owe: $"+Paytaxes);
	 System.out.print("Contiune? Enter Y/N ");
	Yes = keyboard.nextLine();
	

  }while( Yes.equals("Y") || yes.equals("y")); // Doing a  While loop if User want to keep going.
	
}
}