/*
keep a unqiue studen with his quiz score
*/

 import java.util.*;
  class Student {
  private final int MAX_SCORE = 5;// this is the limit constant of max score
  public static int id_gen = 1;// this is the
  private String name;// this is the string for name
  private int id; // unique id
  private double scores;// unique score
  

  public Student(String name, int id, double scores){// this is the contrustor for the student name and greade.
  this.name = name;
  this.scores = scores;
  this.id = id_gen++;
   }
   
   public String getName()// this is the getters for the student
   {
	   return this.name;
   }
    public double getscores()
   {
	   return this.scores;
   }
   
   public String toString(){// this is what will print out 
	   return "\nName: " + this.name+ "\nID: "+this.id+"\nGrade: "+this.scores;
  }
  
  public double avgScore(Student[] array){// this is a method that will calcuate the average for each student.
  
   double avaerage;// This is the average of the test score.
   double sum = 0.0;// This will put the add the student grade scores
 
   
   for(int t = 0; t < array.length; t++)// this will give the araerage for the test scores
   {  
   sum += array[t].getscores();// add up the sum of all score
   }
   avaerage = sum/array.length;// divides the sum of the arry length.
   return avaerage;
   
 }
}

public class A{
  public static void main(String[] args){
	String n;// this user input for named
	int id;// this is for thr input for 
	double test;// this is the input for the graded score
	int a = 0;// this will give the user to pick the number of arrays.
	 
	  try{// this will give the user an array of student
	   a =  Integer.parseInt(args[0]);
	  } catch(Exception e){
		  a = 2;
	  }
	
	Student[] students = new Student[a];// This array will put in the user input in.
	Scanner keyboard = new Scanner(System.in);// This will help the user put thier input
	
	  //This will ask the user for there name, id, grade score
	  for (int r = 0; r < students.length; r++)
	{
		System.out.println("\nEnter Student name: ");
		if( r >= 1)
		keyboard.nextLine();
		 n = keyboard.nextLine();// this will ask for the user for the student name.
		 
		 System.out.println("\nID: ");
		 id = keyboard.nextInt();// get the id
		 
		 System.out.println("\nEnter Student's grade: ");
		 test = keyboard.nextDouble( );// this will ask the user for the studen test grade
		 
		 students[r] = new Student(n,id,test);// this will show the student name id, and test grade
	}
	   
	   for (int i = 0; i < students.length; i++)// This will show the student name and grade and id 
	  {
	  System.out.println(students[i].toString());
	   }
	 System.out.println("\nStudent's test average: " + students[0].avgScore(students));// it add up the student score
	
	 System.out.println("Current ID: "+ Student.id_gen);// show the current id of the student it has
  }
}