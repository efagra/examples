package lab02.universitysystem;

import java.util.ArrayList;

public class Registry {

	private String name;
	private ArrayList<Course> courses;

	public Registry(String name) {
		this.name = name;
		this.courses = new ArrayList<Course>();
	}

	public void addCourse(Course aCourse) {
		courses.add(aCourse);
	}

	public void printReport() {
		System.out.println("#### " + name + "####");
		//for(Course c : courses)
		for(int i=0; i<courses.size(); i++) {
			Course course = courses.get(i);
			System.out.println("Course Name: " + course.getName());
			course.printRoomName();
			course.printStudentsInfo();
			System.out.println("-----------------");
		}

	}

}