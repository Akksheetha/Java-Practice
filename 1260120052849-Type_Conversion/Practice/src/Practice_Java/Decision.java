package Practice_Java;
import java.util.Scanner;
public class Decision {
	public static void main(String[] args){
		String seattype;
		Scanner sc = new Scanner(System.in); 
		seattype = sc.next(); 
		if (seattype.equals("REGULAR")) { 
		    System.out.println("You have selected Executive Seat and cost is Rs.80");
		}
		else if (seattype.equals("PREMIUM")) { 
			System.out.println("You have selected Premium Seat and cost is Rs.100");
		}
		else if (seattype.equals("EXECUTIVE")) { 
			System.out.println("You have selected Regular Seat and cost is Rs.120");
		} 
		else if (seattype.equals("VIP")) { 
			System.out.println("You have selected VIP Seat and cost is Rs.150");
		} 
		else {
			System.out.println("You have not selected any type");
		}
		sc.close();
	} 
}
