public class StudentValidator
{
    public static void validate(Student student) throws InvalidAgeException, InvalidScoreException
    {
        if (student.getAge() < 18 || student.getAge() > 60)
        {
            throw new InvalidAgeException("Invalid Age");
        } else if (student.getScore() < 0 || student.getScore() > 100)
        {
            throw new InvalidScoreException("Invalid Score");
        }
        else
        {
            System.out.println(student);
        }
    }    
}
