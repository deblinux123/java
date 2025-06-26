import java.util.Arrays;
import java.util.List;
import java.util.Comparator;


public class NewChallenge 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(10, 3, 7, 8, 6, 13, 4);

        int sum = nums.stream()
                      .filter(n -> n < 10)
                      .sorted(Comparator.reverseOrder())
                      .limit(3)
                      .reduce(0, Integer::sum);

        System.out.println("The sum is " + sum);
    }    
}
