import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class BigerThan10 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(25, 20, 35, 10, 4, 12);

        // show the numbers > 10 with filter
        
        nums.stream().filter(n -> n > 10).forEach(System.out::println);;

    }    
}
