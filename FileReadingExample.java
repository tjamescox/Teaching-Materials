import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReadingExample
{
    public static void main(String[] args)
    {
        File inFile = new File("phones.txt");
        Scanner reader = null;

        try{
            if(inFile.exists())
            {
                reader = new Scanner(inFile);
                while(reader.hasNextLine()){
                    String line = reader.nextLine();
                    System.out.println(line);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }finally{
            if(reader != null){
                reader.close();
            }
        }
    }
}