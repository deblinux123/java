public class Student
{
	private String name;
	private int id;
	private double grade;
	final String university = "Tehran University";
	private static int count = 0;

	public Student(String name, int id, double grade)
	{
		this.name = name;
		this.id = id;
		this.grade = grade;
		count++;
	}


	String getName()
	{
		return name;
	}

	int getId()
	{
		return id;
	}


	double getGrade()
	{
		return grade;
	}
	public static int getCount()
	{
		return count;
	}

	@Override
	public String toString()
	{
		return "ID: " + id + " | Name: " + name + " | Grade: " + grade + " | University: " + university;
	}
}