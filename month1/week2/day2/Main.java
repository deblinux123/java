import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Farid");
        names.add("babak");

        System.out.println(names);

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 30);
        scores.put("Asma", 100);

        System.out.println(scores);

        HashSet<String> email = new HashSet<>();

        email.add("Info@gmail.com");
        email.add("Info@gmail.com"); // dos'nt run 

        System.out.println(email);

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext())
        {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}