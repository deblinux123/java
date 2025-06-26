import java.util.Arrays;
import java.util.List;


public class NewClass 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(10, 3, 7, 8, 6, 13, 4);

        int sum = nums.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0, Integer::sum);
    
                        System.out.println("The sum is " + sum);
        }

}
