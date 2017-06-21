package lab02.studentcourse;

public class Course {

	private String name;
	private int credits;

	public Course(String text, int number) {
		name = text;
		credits = number;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

}