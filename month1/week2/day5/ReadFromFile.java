import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFromFile 
{
    public static void main(String[] args)
    {
        try(BufferedReader buffer = new BufferedReader(new FileReader("file.txt")))
        {
            String line;
            System.out.println("File Content: ");
            while((line = buffer.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
