import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;


public class Student
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

     
        System.out.println("Enter the number of student: ");
        int count = input.nextInt();

        input.nextLine();

        for (int i = 0; i < count; i++)
        {
            System.out.println("Student name: " + (i + 1) + ": ");
            String name = input.nextLine();
            writeInotFiel(name);
        }
        System.out.println("Do you want to show the student names (y/n): ");
        String answer = input.nextLine().trim().toLowerCase();

        if (answer.equals("yes") || answer.equals("y"))
        {
            readFromFile();
        }
        else
        {
            System.out.println("Done.");
        }
    }

    public static void writeInotFiel(String studentName)
    {
        try(FileWriter writer = new FileWriter("student.txt", true))
        {
            writer.write(studentName + "\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void readFromFile()
    {
        try(BufferedReader buffer = new BufferedReader(new FileReader("student.txt")))
        {
            String line;
            System.out.println("\nFile Content ");
            System.out.println();
            while((line = buffer.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}