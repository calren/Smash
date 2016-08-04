package flight;

public class Flight {

	private Time departureTime;
	private Time arrivalTime;

	public Flight(Time departureTime, Time arrivalTime) {
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return time at which the flight departs
	 */
	public Time getDepartureTime() {
		return departureTime;
	}

	/**
	 * @return time at which the flight arrives
	 */
	public Time getArrivalTime() {
		return arrivalTime;
	}

	public int getTotalFlightTime() {

		return departureTime.minutesUntil(arrivalTime);
	}

}
