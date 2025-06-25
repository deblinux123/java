import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;


public class ReadWithFileApi
{
    public static void main(String[] args)
    {
        try
        {
            List<String> names = Files.readAllLines(Paths.get("names.txt"));

            for (String name : names)
            {
                System.out.println(name);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
