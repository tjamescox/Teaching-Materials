/**
Illustration of inheritance and Polymorphism

Employee: each employee has a name address,get pay, and a check
+ hourly employee: has hours worked and hourly pay rate
+ salary employee: has an annual salary and get pay monthly
+ contracted employee: get pay a lump sum by the contract amount.

*/
   
 abstract class Employee
  {
    private String name;
	protected String address;
	
	//construtor
	public Employee(String name, String address)
	{
		this.name = name;
		this.address = address;
		
	}
	public abstract double getpay();
	
	public String getName()
	{
	   return this.name = name;
	}
	
	public void setName(String name)
	{
	   this.name = name;
	}
	
	public String getAddress()
	{
	   return this.address = address;
	}
	
	public void setAddress(String address)
	{
	   this.address = address;
	}
	
	//printCheck - from getpay->tax 10 ss tax 5%, insurance 2%
    public void printCheck(double pay)
	{
	  final double statetax = 0.1;
	  final double sstax = 0.05;
	  final double insurance = 0.02;
      double decution = (statetax + sstax+ insurance); 	
      double afterTax = pay * decution;		
	  double netPay = pay-afterTax;
	  
	   System.out.println("\nName: "+this.name);
	   System.out.println("Address: "+this.address);
	   System.out.println("Net Pay: " + netPay);
	 }
			
	//public abstract double Raise();
			
}
	
 class HourlyEmployee extends Employee{
	private double payrate;
    private double hoursWorked;
	
    public HourlyEmployee(String name,String address,double payrate, double hoursWorked)
	{
		super(name,address);// call base class construtor
		this.payrate = payrate;// call the payrate
		this.hoursWorked = hoursWorked;// call the hourly rate
		
	 }

   /** ...*/
	public double getpay()
	{
		double pay = this.payrate * this.hoursWorked;
	    this.hoursWorked = 0;// reserat the thing
		return pay;
	}
	
	public double hours(double worked)
	{
		this.hoursWorked += worked;
		
		return this.hoursWorked;
	
	}
 }

/**Driver/ Application
1. get a list of different types of employee
2. print checks for every employee
3. gove raise to all employees, except contracted employee
4. print checks for all employees
*/

public class HR{
    public static void main (String [] args) {
        
        // variables
        double e1Pay;
        
		HourlyEmployee e1 = new HourlyEmployee("Alena","3741 Caseys Cove",5.25, 15);
        //e1.hours(5);
        e1Pay = e1.getpay();
		e1.printCheck(e1Pay);
		
	}
}