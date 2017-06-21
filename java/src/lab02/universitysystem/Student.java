package lab02.universitysystem;

public class Student {

	private String name;
	private String id;
	private Course myCourse;

	public Student(String text1, String text2) {
		name = text1;
		id = text2;
	}

	public void printBasicInfo() {
		System.out.println("Name: " + name);
		System.out.println("AM: " + id);
	}

	public void printInfo()
	{
		System.out.println("Name: " + name);
		System.out.println("AM: " + id);
		if (myCourse!=null)
		{
			System.out.println("Course: " + myCourse.getName());
			System.out.println("Credits: " + myCourse.getCredits());
		}
		else
			System.out.println("No course selected!");
	}

	public void setCourse(Course aCourse) {
		myCourse = aCourse;
	}

	public String getName() {
		return name;
	}

}