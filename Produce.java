  /*
  This is a program will show the Produce,today date, Practor Name, and the charges for produce.
  Step 1 Promo the user to ask the doctor about the produce name.
  Step 2 Promo the user to ask the doctor about today date either the full day in words or numbers.
  Step 3 Promo the user to ask the docotr the practitioner name.
  Step 4 Promo the user to ask the docotr how much for the produce.
  @authour Alena Welch
  @version 1.1
  */
  public class Produce{
  private String ProduceName;// The Produce name is a String and private
  private String TodayDate;// The Today date is a String and private
  private String PractorName;// The Practor name is a String and private
  private double Charges;// The Charges is a double and private
  public Produce(String ProduceName,String TodayDate, String PractorName, double Charges)
   {
   this.ProduceName = ProduceName;
   this.TodayDate = TodayDate;
   this.PractorName = PractorName;
   this.Charges = Charges;
   }//The constructor of the Produce class that is now public with all the indicdicors are three strings and an double.
  
//The  all accessors/gettors of the Produce class that is now public with all the indicdicors are all strings that return to its own indictors.
  public String getProduceName()
 {
	 return this.ProduceName;
 }
	public String getTodayDate(){
	 return this.TodayDate;
 }
   public String getPractorName()
 {
	 return this.PractorName;
 }
  public double getCharges(){
	 return this.Charges;
 }
 
 //The  all mutators/setter of the Patient class that is now public with all the indicdicors are equal its own indictors.
 public void setProduceName(String ProduceName)
	{
	    this.ProduceName = ProduceName;
 }
	public void setMiddleName(String TodayDate)
	{
    this.TodayDate = TodayDate;
 }
 public void setPractorName(String PractorName)
	{
	    this.PractorName = PractorName;
 }
  public void setCharges(double Charges)
	{
	    this.Charges = Charges;
 }

  //The  to String of the Produce class that is public and return to their own indictors.
   public String toString()
    {
        return "\nProduce Name: " + this.ProduceName + "\nDate: " + this.TodayDate + 
                            "\nPractitioner: " + this.PractorName + "\nCharges: " + this.Charges;
    }

  }   