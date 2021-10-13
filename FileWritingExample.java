import java.io.*;

public class FileWritingExample
{
    public static void main(String[] args)
    {
        PrintWriter writer = null;

        try{
            FileWriter outFile = new FileWriter("phones.txt", true);
            writer = new PrintWriter(outFile);

            writer.println("678-444-5555");
            writer.println("678-555-4444");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            if(writer != null){
                writer.close();
            }
        }
    }
}