// methods to know:  getters, setters, constructor, toString
// How do we store data? In 1301: files, arrays, arraylists

// Author: Tanner Cox

import java.util.Scanner;

public class Student
{
    // Step one: define your attributes
    // common practice for programmers to have private data members
    // also to have public get/set methods
    private double gpa;
    private String name;
    private String studentID;
    private int age;

    // Step two: Create constructor method 
    public Student(double gpa, String name, String studentID, int age)
    {
        this.gpa = gpa;
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }

    // Step three: create get methods (AKA accessors)
    public double getGPA()
    {
        return this.gpa;
    }

    public String getName()
    {
        return this.name;
    }

    public String getID()
    {
        return this.studentID;
    }

    public int getAge()
    {
        return this.age;
    }

    // Step four: create set methods (AKA mutators)
    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setID(String studentID)
    {
        this.studentID = studentID;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // Step five: create our toString
    public String toString()
    {
        return "\nStudent's name: " + this.name + "\nStudent's ID: " + this.studentID + "\nGPA: " + this.gpa + "\nAge: " + this.age; 
    }

    // Step six:  create a main method 
    public static void main(String[] args)
    {
        // create variables
        String sName;
        double sGPA;
        String sID;
        int sAge;
        Scanner keyboard = new Scanner(System.in);

        // prompt user to input values
        System.out.print("ENTER name: ");
        sName = keyboard.nextLine();
        System.out.print("Enter GPA: ");
        sGPA = keyboard.nextDouble();
        System.out.print("ENTER ID: ");
        sID = keyboard.nextLine();
        System.out.print("ENTER age: ");
        sAge = keyboard.nextInt();

        // create a student objects
        Student tan = new Student(4.0, "Tanner Cox", "900763527", 25);
        Student evan = new Student(4.0, "Evan Castillo", "900738474", 21);
        Student tobias = new Student(4.0, "Tobias Hollins", "90072537", 22);

        // create object based off of user input
        Student sStudent = new Student(sGPA, sName, sID, sAge);

        System.out.println(sStudent.toString());

        // play around with get methods
        System.out.println("Tanner's GPA: " + tan.getGPA());
        System.out.println("Evan's Student ID: " + evan.getID());
        System.out.println("Tobias' Age: " + tobias.getAge());

        // play around with the set methods
        tan.setGPA(2.2);
        evan.setID("900738347");
        tobias.setAge(23);

        // call our toString method for each object
        System.out.println(tan.toString());
        System.out.println(evan.toString());
        System.out.println(tobias.toString());
    }
}