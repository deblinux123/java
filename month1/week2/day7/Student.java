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

    public int getAge()
    {
        return age;
    }

    public int getScore()
    {
        return score;
    }

    public String toString()
    {
        return name + "," + age + "," + score;
    }

    public static Student fromString(String line)
    {
        String[] parts = line.split(",");
        return new Student(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
    }
}