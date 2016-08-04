package flight;

import java.util.ArrayList;

public class Trip {
	private ArrayList<Flight> flights;

	public Trip(ArrayList<Flight> flights) {
		this.flights = flights;
	}

	/**
	 * @return the number of minutes from the departure of the first flight to
	 *         the arrival of the last flight if there are one or more flights
	 *         in the trip; 0, if there are no flights in the trip
	 */
	public int getDuration() {
		// TODO
		// get departure time of first flight, and arrival time of last flight
		// find the difference between the two

		Flight firstFlight = flights.get(0);
		Time departureTime = firstFlight.getDepartureTime();

		Flight lastFlight = flights.get(flights.size() - 1);
		Time arrivalTime = lastFlight.getArrivalTime();

		return departureTime.minutesUntil(arrivalTime);
	}

	/**
	 * Precondition: the departure time for each flight is later than the
	 * arrival time of its preceding flight
	 *
	 * @return the smallest number of minutes between the arrival of a flight
	 *         and the departure of the flight immediately after it, if there
	 *         are two or more flights in the trip; -1, if there are fewer than
	 *         two flights in the trip
	 */
	public int getShortestLayover() {

		if (flights.size() < 2) {
			return -1;
		}

		int min = 24 * 60;

		for (int i = 0; i < flights.size() - 1; i++) {
			Flight currentFlight = flights.get(i);
			Flight nextFlight = flights.get(i + 1);

			int minutes = currentFlight.getArrivalTime().minutesUntil(nextFlight.getDepartureTime());
			if (minutes < min) {
				min = minutes;
			}
		}

		return min;
	}

}
