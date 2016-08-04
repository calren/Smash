package flight;

public class Time {

	int hour;
	int minutes;

	public Time(int hour, int minutes) {
		this.hour = hour;
		this.minutes = minutes;
	}

	/**
	 * @return difference, in minutes, between this time and other; difference
	 *         is negative if other is earlier than this time
	 */
	public int minutesUntil(Time otherTime) {
		int hourDifference = otherTime.hour - this.hour;
		int minuteDifference = otherTime.minutes - this.minutes;

		return (hourDifference * 60) + minuteDifference;
	}
}
