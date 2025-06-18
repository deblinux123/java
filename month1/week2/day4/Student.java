public class Student 
{
    private String name;
    private int age;
    private int score;
    
    
    public Student(String name, int age, int score)
    {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return this.age;
    }

    int getScore()
    {
        return this.score;
    }

    @Override
    public String toString()
    {
        return "\nName: " + name +
                "\nAge: " + age +
                "\nScore: " + score + "\n";
    }
}
