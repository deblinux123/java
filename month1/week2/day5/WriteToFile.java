
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) 
    {
        List<String> names = List.of("Ali", "Reza", "Ahmad");
        
        try(FileWriter writer = new FileWriter("names.txt"))
        {
            for (String name : names)
            {
                writer.write(name + "\n");
            }
            System.out.println("Nmaes are saved.");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
