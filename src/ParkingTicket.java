
public class ParkingTicket {
	
	
	
	
	private PoliceOfficer policeOfficer;
	private ParkedCar parkedCar;
	private ParkingMeter parkingMeter;
	private int fees;
	
	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public PoliceOfficer getPoliceOfficer() {
		return policeOfficer;
	}

	public ParkedCar getParkedCar() {
		return parkedCar;
	}



	public ParkingMeter getParkingMeter() {
		return parkingMeter;
	}


	
	public ParkingTicket(PoliceOfficer policeOfficer, ParkedCar parkedCar) {
		this.policeOfficer = policeOfficer;
		this.parkedCar = parkedCar;
	}
	
	
	
	public boolean getFine() {
		if(parkedCar.getMinutesParked()<=parkingMeter.getPurchasedParkingMinute()) {
			setFees(25);
			return true;
		} else {
			setFees(10+25);
			return false;
		}
		
	
	}
	

	

	
	
	
	

	
	

}
