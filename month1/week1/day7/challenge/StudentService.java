import java.util.ArrayList;

public class StudentService implements StudentManager
{
    private ArrayList<Student> students = new ArrayList<>();
    
    @Override
    public void addStudent(Student student)
    {
        students.add(student);
        System.out.println("Student Added: " + student.getName());
    }

    @Override
    public void listOfStudents()
    {
        System.out.println("\nStudents: ");
        for (Student student:students)
        {
            System.out.println(student);
        }
    }

    @Override
    public void printTopStudent()
    {
        if (students.isEmpty())
        {
            System.out.println("No Student Yet.");
            return;
        }
        Student top = students.get(0);

        for (Student student : students)
        {
            if (student.getGrade() > top.getGrade())
            {
                top = student;
            }
        }

        System.out.println("\nTop Student: " + top.getName() + " - Grade: " + top.getGrade());
        
    }

    @Override
    public void printAverageGrade()
    {
        if (students.isEmpty())
        {
            System.out.println("No student to calculate the average.");
            return;
        }

        double sum = 0;
        for (Student student : students)
        {
            sum+= student.getGrade();
        }

        double avg = sum / students.size();

        System.out.println("\nAverage Grade: " + avg);
    }
}
