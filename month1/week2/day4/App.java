public class App
{
    public static void main(String[] args)
    {
        
        Student s2 = new Student("Asma", 110, 110);
        try
        {
            StudentValidator.validate(new Student("Farid", 20, 90));
            StudentValidator.validate(s2);
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidScoreException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Done.");
        }
    }    
}
