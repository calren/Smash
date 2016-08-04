package flight;

import java.util.ArrayList;

public class MainTesterClass {

	public static void main(String[] args) {

		Time time1 = new Time(9, 10); // 9:10am
		Time time2 = new Time(10, 15); // 10:15am

		Time time3 = new Time(11, 30); // 11:30am
		Time time4 = new Time(13, 10); // 1:10pm

		// TODO 1
		// create 4 more time objects with the following times;
		// 1) 1:30pm 2) 3:40pm 3) 5:00pm 4) 11:10pm
		Time time5 = new Time(13, 30);
		Time time6 = new Time(15, 40);

		Time time7 = new Time(17, 00);
		Time time8 = new Time(23, 10);

		Flight LAtoVegas = new Flight(time1, time2);
		Flight VegasToHouston = new Flight(time3, time4);
		// TODO 2
		// create flight HoustonToNY with time5 and time6, and flight NYtoLondon
		// with time7 and time8
		Flight HoustonToNY = new Flight(time5, time6);
		Flight NYtoLondon = new Flight(time7, time8);

		ArrayList<Flight> flights = new ArrayList<>();
		flights.add(LAtoVegas);
		flights.add(VegasToHouston);
		flights.add(HoustonToNY);
		flights.add(NYtoLondon);
		// TODO 3
		// add HoustonToNY and NYtoLondon to flights

		Trip trip = new Trip(flights);

		System.out.println("the duration of the first flight from LA to Vegas is: " + LAtoVegas.getTotalFlightTime());

		System.out.println("the duration from LA to London is: " + trip.getDuration());
		System.out.println("the shortest layover of this trip is: " + trip.getShortestLayover());
	}

}
