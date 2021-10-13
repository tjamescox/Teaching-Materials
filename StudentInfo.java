// Get user input for student information
// Author: Tanner Cox

// Step One: import that Scanner Class
// Step Two: create our public class
// Step Three: create our main method
// Step Four: initialize our variables
// Step Five: prompt user to input data and create keyboard object
// Step Six: display user input 

import java.util.Scanner;

public class StudentInfo // title case: All the words have capital first letters
{
    public static void main(String[] args)
    {
        // create variable (memory locations)
        String name;
        String address;
        String phoneNumber; // camel case: All the words following the first word are capital
        String email; 
        String lakerID;
        int age;
        double gpa;

        // create keyboard object
        Scanner keyboard = new Scanner(System.in);

        // prompt the user to input data
        System.out.print("ENTER name: ");
        name = keyboard.nextLine();
        System.out.print("ENTER address: ");
        address = keyboard.nextLine();
        System.out.print("ENTER phone number (xxx-xxx-xxxx): ");
        phoneNumber = keyboard.nextLine();
        System.out.print("ENTER email: ");
        email = keyboard.nextLine();
        System.out.print("ENTER Laker ID: ");
        lakerID = keyboard.nextLine();
        System.out.print("ENTER age: ");
        age = keyboard.nextInt();
        System.out.print("ENTER GPA: ");
        gpa = keyboard.nextDouble();

        // display user input
        System.out.println("\nStudent Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Laker ID: " + lakerID);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}

