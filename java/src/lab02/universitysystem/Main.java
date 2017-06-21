package lab02.universitysystem;

public class Main {

	public static void main(String[] args) {

		Student S1 = new Student("John", "1209");
		Student S2 = new Student("Nick", "1709");
		Student S3 = new Student("Bob", "1711");
		Student S4 = new Student("Mary", "1698");
		Student S5 = new Student("Helen", "1612");

		Course C1 = new Course("Math101");
		Course C2 = new Course("Java");
		Course C3 = new Course("MobileDevelopment");

		ClassRoom R1 = new ClassRoom("Amf13", 80);
		ClassRoom R2 = new ClassRoom("Lab334", 35);
		ClassRoom R3 = new ClassRoom("Lab234", 34);

		Registry Reg1 = new Registry("Department of APPLIED INFORMATICS");

		C1.setClassRoom(R1);
		C2.setClassRoom(R2);
		C3.setClassRoom(R3);

		C1.addStudent(S1);
		C1.addStudent(S2);
		C2.addStudent(S3);
		C2.addStudent(S4);
		C3.addStudent(S5);

		Reg1.addCourse(C1);
		Reg1.addCourse(C2);
		Reg1.addCourse(C3);

		Reg1.printReport();

	}
}