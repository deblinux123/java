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

        System.out.println(scores.get("Ali"));

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

        Student s1 = new Student("ali", 1);
        Student s2 = new Student("babak", 2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        students.add(new Student("Ali", 11));
        students.add(new Student("Sara", 22));
        students.add(new Student("Nima", 33));

        Iterator<Student> iterator2 = students.iterator();

        while(iterator2.hasNext())
        {
            Student s = iterator2.next();
            System.out.println(s);
        }

        
    }
}