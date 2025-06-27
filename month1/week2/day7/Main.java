import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Student> students = new ArrayList<>();

            while (true) {
                System.out.println("Enter name (or 'exit'): ");
                String name = input.nextLine().toLowerCase();
                if (name.equals("exit")) break;

                try {
                    System.out.print("Enter your age: ");
                    int age = input.nextInt();

                    System.out.print("Enter your score: ");
                    int score = input.nextInt();
                    input.nextLine(); // consume extra newline

                    Student s = new Student(name, age, score);
                    StudentValidator.validate(s);
                    students.add(s);

                    System.out.println("Student saved.");

                    System.out.print("Do you want to add another student? (y/n): ");
                    char addAnother = input.nextLine().toLowerCase().charAt(0);
                    if (addAnother != 'y') {
                        System.out.println("Ok, goodbye.");
                        break;
                    }

                } catch (InvalidAgeException | InvalidScoreExeption e) {
                    System.out.println("Error: " + e.getMessage());
                    input.nextLine(); // consume the bad input
                } catch (Exception e) {
                    System.out.println("Unknown error.");
                    input.nextLine(); // prevent infinite loop on bad input
                }
            }

            // Writing to file
            try (FileWriter writer = new FileWriter("students.txt", true)) {
                for (Student student : students) {
                    writer.write(student.toString() + "\n");
                }
            } catch (IOException e) {
                System.out.println("Error saving file.");
            }
        }

        // Reading from file
        System.out.println("\n---------- File Content ----------\n");

        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Student s = Student.fromString(line);
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
