
public class Main {

	public static void main(String[] args){
		StudentService service = new StudentService();

		Student s1 = new Student("mobina", 101, 120);
		Student s2 = new Student("babak", 102, 87.9);
		Student s3 = new Student("farid", 103, 98.0);
		Student s4 = new Student("asma", 104, 10);
		

		service.addStudent(s1);
		service.addStudent(s2);
		service.addStudent(s3);
		service.addStudent(s4);

		service.listOfStudents();
		service.printAverageGrade();
		service.printTopStudent();

		System.out.println("\nTotal Students: " + Student.getCount());
	}
}