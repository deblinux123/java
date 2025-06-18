import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayClass 
{
    public static void main(String[] args)
    {
        int scores[] = {12, 2, 3, 4, 5, 6, 7};

        Scanner input = new Scanner(System.in);

        try
        {
            System.out.println("Enter the index to show you the value: ");
            int idx = input.nextInt();
            int result = scores[idx];
            
            System.out.println("Result is: " + result);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index Out Of Bound");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter just valid integer number.");
        }
        finally
        {
            System.out.println("Done.");
        }
    }    
}
