 /*
  This is a program will show the Patient information
  Step 1 Promo the user to ask the patient thier first,Middle,Last Name.
  Step 2 Promo the user to ask the patient for thier Address
  Step 3 Promo the user to ask the patient for the City they are living at
  Step 4 Promo the user to ask the patient for the five digits of  thier Zip Code.
  Step 5 Promo the user to ask the patient thier  Ememgery contact 
  Step 6 Promo the user to ask the patient thier phone number with dashes 
  Step 7 Promo the user to ask the patient thier Emegracy contract full name.
  Step 8 Promo the user to ask the patient thier Emegracy contract phone number also with dashes.
  @authour Alena Welch
  @version 1.1
 */
 
 public class Patient{
 private String FirstName;// The first name is a String and private
 private String LastName; // The last name is a String and private
 private String MiddleName;// The Middle name is a String and it private
 private String Address;// The Address is a String and it private
 private String City;// The City is a String and it private
 private String ZipCode;// The Zip Cose is a String and it private
 private String PhoneNumber;//The Patient is a String and it private so no can see it.
 private String EName;//The Emegracy contact's Name is a String and it private so no can see it.
 private String EPhoneNumber;//The Emegracy contact's Phone Number is a String and it private so no can see it.
 
 public Patient(String FirstName,String MiddleName,String LastName, String Address, String City, String ZipCode, String PhoneNumber,String EName, String EPhoneNumber){
 this.FirstName = FirstName;
 this.MiddleName = MiddleName;
 this.LastName = LastName;
 this.Address = Address;
 this.City = City;
 this.ZipCode = ZipCode;
 this.PhoneNumber = PhoneNumber;
 this.EName = EName;
 this.EPhoneNumber = EPhoneNumber;
}//The constructor of the Patient class that is now public with all the indicdicors are all strings and equal to itself.
 
 //The  all accessors/gettors of the Patient class that is now public with all the indicdicors are all strings that return to its own indictors.
 public String getFirstName()
 {
	 return this.FirstName;
 }
	public String getMiddleName(){
	 return this.MiddleName;
 }
 public String getLastName(){
	 return this.LastName;
 }
  public String getAddress(){
	 return this.Address;
 }
  public String getCity(){
	 return this.City;
 }
 public String getZipCode(){
	 return this.ZipCode;
 }	 
  public String getPhoneNumber(){
	 return this.PhoneNumber;
 } 
 public String getEName(){
	 return this.EName;
 }
	 public String getEPhoneNumer(){
	 return this.EPhoneNumber;
 }
 
 //The  all mutators/setter of the Patient class that is now public with all the indicdicors are equal its own indictors.
	public void setFirstName(String FirstName)
	{
	    this.FirstName = FirstName;
 }
	public void setMiddleName(String MiddleName)
	{
    this.MiddleName = MiddleName;
 }
public void setLastName(String LastName){
	this.LastName = LastName;
 }
 
 public void setPhoneNumber(String PhoneNumber){
	this.PhoneNumber = PhoneNumber;
 }
 
  public void setAddress(String Address){
	this.Address = Address;
 }
 
  public void setCity(String City){
	this.City = City;
 }
 
 public void setZipCode(String ZipCode){
	 this.ZipCode = ZipCode;
 }
 
 public void setEName(String EName){
	 this.EName = EName;
 }
 
	 public void setEPhoneNumer(String EPhoneNumber){
	 this.EPhoneNumber = EPhoneNumber;
 }
 public String toString()
    {
        return "\nPatient Name: " + this.FirstName+" "+this.MiddleName+ " "+LastName+   "\nAddress: " +this.Address+" "+this.City+" "+this.ZipCode+"\nPhone Number: "+this.PhoneNumber+
                            "\nEmecracy Contract's Name:  "+ this.EName + "\nEmecracy Contract's Phone Number : " + this.EPhoneNumber;
    }

} 
 
	