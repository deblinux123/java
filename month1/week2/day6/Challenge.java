import java.util.Arrays;
import java.util.List;


public class Challenge 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList( 2, 3, 5);

        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("Sum is " + sum);

        int result = nums.stream().reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }    
}
