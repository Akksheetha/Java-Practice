package Practice_Java;

public class TheatreScreen {
	public static int totalseats = 20;
	TheatreScreen(){
		System.out.println("Current seats availability : "+totalseats);
	}
	public void displayTheatreScreen
() {
		System.out.println("Current seat availability : "+totalseats);
	}
	public static void BookTicket(int nooftickets) {
		System.out.println("No.of Seats booked : "+nooftickets);
		totalseats = nooftickets;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Screen ticket availability status");
		TheatreScreen TS1 = new TheatreScreen();
		TS1.BookTicket(4);
		TheatreScreen TS2 = new TheatreScreen();
		TS2.BookTicket(5);
		TS2.displayTheatreScreen();

	}

}
