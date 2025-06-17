import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ComputeChallenge 
{
    public static void main(String[] args)
    {
        HashMap<String, Score<Double>> grades = new HashMap<>();

        Score<Double> g1 = new Score<>();
        Score<Double> g2 = new Score<>();
        Score<Double> g3 = new Score<>();

        g1.setScore(17.5);
        g2.setScore(20.0);
        g3.setScore(18.8);

        grades.put("Ali", g1);
        grades.put("Farid", g2);
        grades.put("Asma", g3);

        // for (String name : grades.keySet())
        // {
        //     Score<Double> score = grades.get(name);
        //     System.out.println(name + ": " + score.getScore());
        // }

        // double total = 0;
        // int count = 0;
        // for (Score<Double> score : grades.values())
        // {
        //     total += score.getScore();
        //     count++;
        // }

        // double average = total / count;
        // System.out.printf("Average Grade: %.2f\n", average);

        // iterator
        System.out.println("Using Iterator.");

        Iterator<Map.Entry<String, Score<Double>>> iterator = grades.entrySet().iterator();

        double total = 0;
        int count = 0;

        while(iterator.hasNext())
        {
            Map.Entry<String, Score<Double>> entry = iterator.next();

            String name = entry.getKey();
            double grade = entry.getValue().getScore();

            System.out.println(name + ": " + grade);

            total += grade;
            count++;
        }

        double average = total / count;
        System.out.printf("Average Grade: %.2f\n", average);
    }
}
