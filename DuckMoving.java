import java.io.IOException; 
import java.util.Random;
public class DuckMoving {
   public static void cls() throws IOException, InterruptedException {
	if (System.getProperty("os.name").contains("Windows"))
	   new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
 	else
	   Runtime.getRuntime().exec("clear");
	}
  
public static void pause(int duration) throws InterruptedException{
Thread.sleep(duration);
	}

public static boolean isValidSpeed(double speed)  {
      boolean valid = true;
 //code to check if speed is withing the range of 0 - 5
 
 return valid;
   }
   
public static double getRandomSpeed() {
	int upper = 9;
	int lower = 1;
	Random rand = new Random();
	int r = 1 + rand.nextInt(upper - lower + 1);
	return (r/10.0);
}

   
public static void main(String[] args) throws IOException, InterruptedException {
   


double speed = getRandomSpeed();  //.1 to .9

System.out.println("speed = " + speed);
pause(2000);

if (args.length == 0)
   speed = speed * 1000;
else if (args.length == 1){
   speed = Double.parseDouble(args[0]);
   if (isValidSpeed(speed))
      speed = speed * 1000;
   else {
   System.out.println("Invalid speed, must be 0 - 5!");
   System.exit(0);
   }
}
else {
	  System.out.println("Invalid, at most one argument!");
	  System.exit(0);
  }
  
final int FIG_HEIGHT = 5;

String quack1 = "  __(.)<";
String quack2 = "  __(.)=";

String [] pos = new String[FIG_HEIGHT];
pos[0] ="        ";
pos[1] ="     _  ";
pos[2] ="  __(.)<";
pos[3] ="  \\___) ";
pos[4] ="        ";


cls();
int k = 0;
while (k < 50) {
for (int i = 0; i < pos.length; i++)  {
 for (int j = 0; j < k; j++)
   System.out.print(" ");
 if ((k % 2) == 0)
    pos[2] = quack1;
 else
    pos[2] = quack2;
 System.out.println(pos[i]);
}
pause((int)speed);
cls();
k++;
}
}
}
	