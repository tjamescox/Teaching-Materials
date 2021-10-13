/** ============== TO DO ===================================================
  Todo:
    1. create an array of Student objects from the user's inputs
	2. for each Student object, obtain his quiz scores from the user's input
	3. write aan instance method in the Student class to calculate and 
	    and return score average for each student.
	The followings are optionalfor advanced students:
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
  private double[] scores;
  
  /** Constructor method */
  public Student(String name, int id, double[] scores){
    this.name = name;
	  this.scores = new double[MAX_SCORES];
	  this.id = id;
  }

  // get method for double array
  public double[] getArray()
  {
      return this.scores;
  }
  
  /** to be completed */
  public String toString(){
     return "\nName: " + this.name + "\nID: " + this.id;	  
  }
  
  /** to be completed */
  public double avgScore(double[] scores){
    double average;
    double sum = 0.0;

    for(int i = 0; i < scores.length; i++)
    {
        sum += scores[i];
    }

    average = sum/scores.length;

    return average;
  }
}

/**
 An in class illustration of classes, method, static fields and 
 constants(final)
*/
public class StudentDriver2{
  /** this driver is used to test the Student class 
    === to be completed ===	
  */
  public static void main(String[] args){

  // initialize the variable I need
  String name;
  int id;
  double quizGrade;
  double[] studentGrade = new double[5];
  double average;
	
	//create a few students
  Student[] students = new Student[5];

  // create a keyboard object
  Scanner keyboard = new Scanner(System.in);
  
  // nested for loop structure to get user info about student objects
  for(int i = 0; i < students.length; i++)
  {
     // prompt to user to input their name/id
     System.out.print("ENTER your name: ");
     if(i >= 1)
        keyboard.nextLine();
     name = keyboard.nextLine();
     System.out.print("ENTER you ID: ");
     id = keyboard.nextInt();

     for(int j = 0; j < 5; j++)
     {
        // get quiz grades from the student
        System.out.print("Enter quiz " + j + " grade: ");
        quizGrade = keyboard.nextDouble();
        studentGrade[j] = quizGrade;
     }

     students[i] = new Student(name, id, studentGrade);
  }
  
	//print the students out
	for(int p = 0; p < students.length; p++){
      System.out.println(students[p]);
      average = students[p].avgScore(students[p].getArray());
      System.out.println("Student quiz average: " + average);

	}
	//print out the unique id generator 
  //System.out.println("Current ID: " + Student.id_gen);
 
  }
}