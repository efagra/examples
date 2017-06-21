package lab02.studentcourse;

public class Main {

	public static void main(String[] args) {

		Student S1 = new Student("John", "1209");
		Student S2 = new Student("Nick");

		//S1.printInfo();  if printInfo is called here it will
		//S2.printInfo();  cause a Null Pointer Exception

		Course C1 = new Course("Java", 5);

		S1.setMyCourse(C1);	// link Student S1->Course C1
		S2.setMyCourse(C1);

		S2.printInfo();
		S2.printInfo();
	}
}