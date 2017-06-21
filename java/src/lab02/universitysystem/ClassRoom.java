package lab02.universitysystem;

public class ClassRoom {

	private String location;
	private int capacity;

	public ClassRoom(String location, int capacity) {
		this.location = location;
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public String getLocation() {
		return location;
	}

}