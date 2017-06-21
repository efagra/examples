package lab02.universitysystem;

import java.util.*;

public class Course {

	private String name;
	private int credits;
	private ArrayList<Student> enrolledStudents;
	private ClassRoom myClassRoom;

	//public Course(String name, int credits)
	public Course(String text) {
		name = text;
		enrolledStudents = new ArrayList<Student>();
		//myClassRoom = new ClassRoom("Not defined", 0);
	}

	public void addStudent(Student s) {
		if(enrolledStudents.size() < myClassRoom.getCapacity())	{
			enrolledStudents.add(s);
			//s.setMyCourse(this);
			System.out.println("Student " + s.getName() + " has been added to " + name);
		}
		else 
			System.out.println("Sorry, we are full, try next semester");
	}
	
	public void printStudentsInfo() {
		//System.out.println("==== COURSE: " + name + " ====");
		//System.out.println("ECTS: " + credits);
		//System.out.println("Classroom: " + myClassRoom.getLocation()
        //    + " (" + myClassRoom.getCapacity() + " seats)");
		//System.out.println("LIST OF STUDENTS ----->");
		for(int i=0; i<enrolledStudents.size(); i++) {
			//System.out.print((i+1) + ". ");
			//Student s = enrolledStudents.get(i);
			//s.printBasicInfo();

			//enrolledStudents.get(i).printBasicInfo();

			enrolledStudents.get(i).printInfo();
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setClassRoom(ClassRoom aRoom) {
		myClassRoom = aRoom;
	}
	
	public void printRoomName() {
		System.out.println("Location: " + myClassRoom.getLocation());
	}

	public int getCredits() {
		return credits;
	}

}