import java.util.Scanner;
import java.util.InputMismatchException; // این رو اضافه کن
import java.lang.ArithmeticException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter 2 numbers: ");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();

            double result = num1 / num2;
            System.out.printf("Result: %.2f\n", result);
        }
        catch (ArithmeticException e) {
            System.out.println("num2 cannot be 0.");
        }
        catch (InputMismatchException e) {
            System.out.println("لطفاً عدد معتبر وارد کنید.");
        }
        finally {
            System.out.println("Done");
        }


        System.out.println("Enter your age: ");
        int age = input.nextInt();

        try
        {
            Person.validAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            System.out.println("Done.");
        }
    }
}
