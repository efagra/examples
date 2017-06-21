package lab02;

public class TimeStamp {

	private int hour;
	private int minutes;
	private int seconds;

	public TimeStamp(int h, int m, int s) {
		hour = h;
		minutes = m;
		seconds = s;
	}

	public void printTime() {
		System.out.println(hour + ":" + minutes + ":" + seconds);
	}

	public void increaseHourByOne() {
		hour++;
		if(hour == 24)
			hour = 0;
	}

}