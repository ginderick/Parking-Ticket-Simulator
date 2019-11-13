
public class ParkedCar {
	
	private String model, color, make;
	private int licenseNumber, minutesParked;
	
	public ParkedCar(String model, String color, String make, int licenseNumber, int minutesParked) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.minutesParked = minutesParked;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public int getMinutesParked() {
		return minutesParked;
	}
	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}
	
	@Override
	public String toString() {
		return "Car Model: " + model + "\nColor: " + color + "\nMake " + make + "\nLicenseNumber: " + licenseNumber;
	}
	
	

}
