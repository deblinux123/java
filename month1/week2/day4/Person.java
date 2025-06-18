public class Person
{
    public static void validAge(int age) throws InvalidAgeException
    {
        if (age < 0 || age > 100)
        {
            throw new InvalidAgeException("Age out of valid bound");
        }else
        {
            System.out.println("You are " + age + " years old.");
        }
    }
}