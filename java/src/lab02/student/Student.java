package lab02.student;

public class Student {

	private String name;
	private String id;

	public Student(String text1, String text2) {
		name = text1;
		id = text2;
	}

	public Student(String text1) {
		name = text1;
		id = "9999";
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return id;
	}

	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("AM: " + id);
	}

}