/** ============== TO DO ===================================================
  Todo:
    1. create an array of Student objects from the user's inputs
	2. for each Student object, obtain his quiz scores from the user's input
	3. write aan instance method in the Student class to calculate and 
	    and return score average for each student.
	The followings are optional for advanced students:
	4. create an intance method call equals to compare if two students have
       the same avage scores.	
	5. create a copy constructor so a new independent Student object can be 
	   created as clone of an existing
   =========================================================================
*/

import java.util.Scanner;

/*
 A class to keep each unique student with his 5 quiz scores
*/
class Student {
  private final int MAX_SCORES = 5; //used as max array size
  public static int id_gen = 1; //unique number generator
  
  private String name;
  private int id; //unique id
  private double scores;
  
  /** to be completed */
  public Student(String name, int id, double scores){
    this.name = name;
	  this.scores = scores;
	  this.id = id;
  }

  // get method for name
  public String getName()
  {
    return this.name;
  }

  // set method for scores
  public void setScores(double scores)
  {
    this.scores = scores;
  }

  // get method for scores
  public double getScores()
  {
      return this.scores;
  }
  
  /** to be completed */
  public String toString(){
     return "\nName: " + this.name + "\nID: " + this.id +"\nGrade: " + this.scores;	  
  }
  
  /** to be completed */
  public double avgScore(Student[] array){
      double average;
      double sum = 0.0;

      for(int t = 0; t < array.length; t++)
      {
        sum += array[t].getScores();
      }

      average = sum / array.length;
	return average; ///dummy return  
  }
}

/**
 An in class illustration of classes, method, static fields and 
 constants(final)
*/
public class StudentDriver{
  /** this driver is used to test the Student class 
    === to be completed ===	
  */
  public static void main(String[] args){
   
  Student[] students = new Student[5];
  double test;
  String name;
  int id;

  Scanner keyboard = new Scanner(System.in);
    
  for(int r = 0; r < students.length; r++)
  {
     System.out.print("ENTER name: ");

     if(r >= 1)
        keyboard.nextLine();

     name = keyboard.nextLine();
     System.out.print("ENTER ID: ");
     id = keyboard.nextInt();
     System.out.print("ENTER test grade: ");
     test = keyboard.nextDouble();

     students[r] = new Student(name, id, test);
  }

	//create a few students
//   students[0] = new Student("Ken", 928374, 0);
//   students[1] = new Student("Jose", 938454, 0);
//   students[2] = new Student("Tanner", 348454, 0);
//   students[3] = new Student("Alena", 873454, 0);
//   students[4] = new Student("Jack", 234454, 0);
  
  // for loop to get test averages from students
//   for(int j = 0; j < students.length; j++)
//   {
//     System.out.print(students[j].getName() + " enter test grade average: ");
//     answer = keyboard.nextDouble();
//     students[j].setScores(answer);
//   }

  System.out.println("\nStudent's test average: " + students[0].avgScore(students));

	//print the students out
	for(int i = 0; i < 2; i++){
	  System.out.println(students[i]);
	}
	//print out the unique id generator 
    System.out.println("Current ID: " + Student.id_gen);
 
  }
}