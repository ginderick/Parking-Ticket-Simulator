
public class ParkingTicketDemo {

	public static void main(String[] args) {
		
		ParkedCar car = new ParkedCar("Avanza", "black", "Toyota", 15, 1995);
		ParkingMeter meter = new ParkingMeter(5);
		PoliceOfficer police = new PoliceOfficer("Magno", 124553);
		ParkingTicket parkingTicket = new ParkingTicket(police, car);
		
		
		System.out.println(parkingTicket.getParkedCar());
		System.out.println(parkingTicket.getFine());
		System.out.println(parkingTicket.getPoliceOfficer());
		System.out.println(police.getTime(car, meter));
		
		
	
	}

}
