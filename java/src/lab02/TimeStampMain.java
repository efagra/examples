package lab02;

public class TimeStampMain {

	public static void main(String[] args) {

		TimeStamp t1 = new TimeStamp(23, 45, 12);

		t1.printTime();

		t1.increaseHourByOne();
		t1.increaseHourByOne();

		t1.printTime();

	}

}