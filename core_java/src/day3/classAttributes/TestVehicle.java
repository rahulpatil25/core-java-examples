package day3.classAttributes;

import day3.beans.Vehicle;

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle(789, "Three", "Black");
		Vehicle vehicle2 = new Vehicle(456, "Two", "Grey");
		Vehicle vehicle3 = new Vehicle(321, "Four", "Green");
		Vehicle vehicle4 = new Vehicle(357, "Ten", "White");
		
		Vehicle[] arrayOfVehicles = {vehicle1, vehicle2, vehicle3, vehicle4};
		
		TestVehicle testVehicle = new TestVehicle();
		testVehicle.displayVehicleInformation(arrayOfVehicles);
		
	}
	
	public void displayVehicleInformation(Vehicle[] arrayOfVehicles) {
		for(Vehicle v : arrayOfVehicles) {
			System.out.println(v);
		}
	}
}
