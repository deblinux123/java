import java.util.Arrays;
import java.util.List;

public class EvenSquareSum 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4, 7, 10, 13, 2, 8, 1);

        int sum = nums.stream()
                         .filter(n -> n % 2 == 0)
                         .map(n -> n * n)
                         .reduce(0, Integer::sum);

        System.out.println("The result is " + sum);

    }    
}
