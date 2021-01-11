package day3.beans;

public class Vehicle {
	private int serialNumber;
	private String noOfWheels;
	private String colorOfVehicle;
	
	
	public Vehicle() {
		
	}
	
	public Vehicle(int serialNumber, String noOfWheels, String colorOfVehicle) {
		super();
		this.serialNumber = serialNumber;
		this.noOfWheels = noOfWheels;
		this.colorOfVehicle = colorOfVehicle;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(String noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getColorOfVehicle() {
		return colorOfVehicle;
	}
	public void setColorOfCar(String colorOfVehicle) {
		this.colorOfVehicle = colorOfVehicle;
	}
	@Override
	public String toString() {
		return "Vehicle [serialNumber=" + serialNumber + ", noOfWheels=" + noOfWheels + ", colorOfVehicle=" + colorOfVehicle
				+ "]";
	}
	
	
	
}
