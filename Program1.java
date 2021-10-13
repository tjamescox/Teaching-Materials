//Welcome to my first program
import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		//Print a situational dialogue between a student and user
			System.out.println("User: Hello, student! I'm your new digital assistant. How may I help you today?");
			System.out.println("Student: Hi, I would like to calculate my overall average for my Computer Science course this semester.");
			System.out.println("User: Okay, I can help you with that! According to your CSCI 1301 syllabus, the weight of each component are:");
            
            // create keyboard object
            Scanner keyboard = new Scanner(System.in);

			//Decide about weighted variables
				int weightLabAndProg = 40;
				int weightTestOne = 15;
				int weightTestTwo = 15;
				int weightFinalExam = 30;
			
			//Design input from user
			System.out.println("Labs/Programs = " +  weightLabAndProg + "%");
			System.out.println("Test One = " + weightTestOne + "%");
			System.out.println("Test Two = " + weightTestTwo + "%");
			System.out.println("Final Exam = " + weightFinalExam + "%");
		
		//Print a situational dialogue between a student and user 
			System.out.println("User: Please let me know your grade for each component.");
			System.out.println("Student: Sure. Here are my grades for this semester:");
			
			//Decide about values variables from student
				double labAndProg;
				double testOne;
				double testTwo;
                double finalExam;
                
                System.out.print("ENTER lab/programs average: ");
                labAndProg = keyboard.nextDouble();
                // TODO: get the user input for testOne, testTwo, finalExam
			
			//Design input from student
			System.out.println("Labs/Programs = " + labAndProg);
			System.out.println("Test One = " + testOne);
			System.out.println("Test Two = " + testTwo);
			System.out.println("Final Exam = " + finalExam);
			
		//Print a situational dialogue between a student and user
			System.out.println("User: Great! Let me calculate that for you.");
			
			//Computing using formula
				double overallAverage;
				overallAverage = 0.4 * labAndProg + 0.15 * testOne + 0.15 * testTwo + 0.3 * finalExam;

			//Formula Output
			System.out.println("User: Okay, according to the system, your overall average in CSCI 1301 is " + overallAverage + " percent!");
        }
}