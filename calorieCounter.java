import java.util.Scanner;
   
public class CalorieCounter {
    public static void main (String[] args){
    
        int age;
        int height;
        int weight;
        String gender;
        int BMR;
        int exerciseDays;
        double cal=0;
        int calorieTaken;
        int totalCalorie;
        String extraCalorie= "yes";
        String answer;


    
    
    
    
    Scanner Keyboard= new Scanner(System.in);
    System.out.print("What is your Gender? Enter Male or Female:  ");
    gender = Keyboard.nextLine();
    if(gender.equals("Male")|| gender.equals("male")){
  
    
    System.out.print("Enter your Weight: "
            );
    weight = Keyboard.nextInt();
  
    System.out.print("Enter your Height: ");
    height = Keyboard.nextInt();
  
  
    System.out.print("Enter your Age: ");
    age = Keyboard.nextInt();
    
   BMR = (int) (665 + (6.23 * weight) + (12.7 * height) - (6.8 * age));
    System.out.println("Your BMR is: "+ BMR);
      }
       
    else{
    
    System.out.print("Enter your Weight: "
            );
    weight = Keyboard.nextInt();
  
    System.out.print("Enter your Height: ");
    height = Keyboard.nextInt();
  
  
    System.out.print("Enter your Age: ");
    age = Keyboard.nextInt();
        BMR = (int) (655 + (4.35 * weight) + (4.7 * height) - (4.7 * age));
    System.out.println("Your BMR is: "+ BMR);}
    
    
            
        System.out.print("How many days do you exercise? :  ");
        exerciseDays= Keyboard.nextInt();
       
    if (exerciseDays>0)
    {
        cal = (BMR * 1.2);
        System.out.print("Total calories with no excersie at all: ");
    }
    
        
        else if (exerciseDays >= 1 && exerciseDays <=3){
         cal = (BMR *1.375);
              
         System.out.println("\n Total calories after light excersie:: "+ cal);}
              
        else if(exerciseDays >= 3 && exerciseDays <=5){
        cal = (BMR *1.55);
        System.out.println("\nTotal calories after moderate excersie: "+ cal);}
            
            
            
        else if (exerciseDays >= 6 && exerciseDays <=7) {
                 cal = (BMR *1.725);
             
              
        System.out.println("\nTotal calories after intense excersie: "+ cal);}
            
    else {
                  cal = (BMR *1.9);
             
              
                   System.out.println("\nIntense excersie with active job : "+ cal);}
            
            
            do{
                Keyboard.nextLine();
                System.out.println("\nWhat did you have in your breakfast? ");
                 Keyboard.nextLine();
                System.out.println("\nWhat did you have in your lunch?  ");
                 Keyboard.nextLine();
                System.out.println("\nWhat did you have in your Snack? ");
                 Keyboard.nextLine();
                System.out.println("\nWhat did you have in your dinner? ");
                 Keyboard.nextLine();
               System.out.println("\nHow many total calories have you taken today? " );
               calorieTaken= Keyboard.nextInt();
               cal= cal-calorieTaken;
               System.out.println("\nTotal calorie taken: "+ cal);
             Keyboard.nextLine();
               System.out.println("Do you want to enter any more calories? :  ");
              answer = Keyboard.nextLine();
               
            }while(answer.equals("Yes")|| answer.equals("yes"));
    
}
}