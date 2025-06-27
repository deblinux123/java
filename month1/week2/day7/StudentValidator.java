public class StudentValidator {
    public static void validate(Student s) throws InvalidAgeException, InvalidScoreExeption {
        if(s.getAge() < 18 || s.getAge() > 70)
            throw new InvalidAgeException("Invalid Age.");
        if(s.getScore() < 0 || s.getScore() > 100)
            throw new InvalidScoreExeption("Invalid Score.");
    }
}
