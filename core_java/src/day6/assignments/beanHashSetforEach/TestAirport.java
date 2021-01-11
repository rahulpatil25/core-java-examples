package day6.assignments.beanHashSetforEach;

import java.util.*;

public class TestAirport {
	public static void main(String[] args) {
		Airport airport1 = new Airport(5, "Copenhagen", "18:00");
		Airport airport2 = new Airport(2, "Singapore", "18:00");
		Airport airport3 = new Airport(7, "Dubai", "18:00");
		Airport airport4 = new Airport(2, "New York", "18:00");
		
		Set<Airport> airportSet = new HashSet<Airport>();
		
		airportSet.add(airport1);
		airportSet.add(airport2);
		airportSet.add(airport3);
		airportSet.add(airport4);
		
		for(Airport airport : airportSet) {
			System.out.println(airport);
		}
	}
}
