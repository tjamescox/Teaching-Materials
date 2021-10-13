// persons, customer

public class Person
{
// Attributes 
private String name;
private String address;
private int phonenumber;

// Constructor 
public Person(String name, String address, int phonenumber)
 {
this.name = name;
this.address = address;
this.phonenumber = phonenumber;
 }

// copy contructor
public Person(Person b)
 {
 b.name = name;
 b.address = address;
 b.phonenumber = phonenumber;
 }
 
 //getters ( accessors)
 public String getName()
  {
   return this.name;
  } 
  public String getAddress()
  {
   return this.address;
  }
  public int getPhonenumber()
  {
   return this.phonenumber;
  }
  
  // setters ( mutators)
  public void setName(String name)
  {
   this.name = name;
  }
  public void setAddress(String address)
  {
  this.address = address;
  }
  public void setPhonenumber(int phonenumber)
  {
   this.phonenumber = phonenumber;
  }
  
  //toString method
  public String toString()
  {
   return "\nPerson name: " + this.name + "\nAddress: " + this.address + "\nPhonenumber: " + this.phonenumber;
  }
} // end class Person

class Customer extends Person
{
 // attributes 
 private int customernumber;
 private boolean customermaillist;
 
 // constructor 
 public Customer(String name, String address, int phonenumber, int customernumber, boolean customermaillist)
  {
   super(name, address, phonenumber);
   this.customernumber = customernumber;
   this.customermaillist = customermaillist;
  }
  
  // getter
  public int getCustomernumber()
  {
   return this.customernumber;
  }
  
  public boolean getCustomermaillist()
  {
   return this.customermaillist;
  }
  
  // setter
  public void setCustomernumber(int customernumber)
  {
   this.customernumber = customernumber;
  }
  public void setCustomermaillist(boolean customermaillist)
  {
   this.customermaillist = customermaillist;
  }
  
  // toString method
  public String toString()
  {
   return "\nPerson name: " + getName() + "\nAddress: " + getAddress() + "\nPhonenumber: " + getPhonenumber() + "\nCustomernumber: " + this.customernumber + "\nCustomermaillist: " + this.customermaillist;
  }
}  
 