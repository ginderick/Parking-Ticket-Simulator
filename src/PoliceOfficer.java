
public class PoliceOfficer {
	
	private String officerName;
	private int badgeNumber;
	private ParkedCar parkedCar;
	private ParkingMeter parkingMeter;
	
	public PoliceOfficer(String name, int badgeNum) {
		this.officerName = name;
		this.badgeNumber = badgeNum;
	}
	
	

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public int getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	public String getTime(ParkedCar parkedCar, ParkingMeter parkingMeter) {
		if(parkedCar.getMinutesParked()>= parkingMeter.getPurchasedParkingMinute()) {
			return "Parking ticket is not expired";
		}else {
			return " Parking ticket is expired";
		}
	}

	public String getOfficerName() {
		// TODO Auto-generated method stub
		return officerName;
	}
	
	public String toString() {
		return "Officer Name: " + officerName + "\nBadge Number: " + badgeNumber;
	}



}
