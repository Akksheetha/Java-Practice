package Practice_Java;
import java.util.Scanner;
public class MovieSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[][] {{"B","B","A","A","A"},{"A","A","B","A","A"},{"B","B","B","A","B"}};
		int vip = 0, premium = 0,regular = 0,viptotal = 5,premiumtotal =10,regulartotal = 5;
		System.out.println("Movie Seat Arrangement");
		for(int i = 0;i<arr.length;i++) {
			if(i==0) {
				System.out.println("---------VIP Seats-------------");
			}
			else if(i==1) {
				System.out.println("---------Premium Seats---------");
			}
			else if(i==2) {
				System.out.println("---------Regular Seats---------");
			}
			for (int j=0; j < arr[i].length; j++) {
				System.out.print(" "+arr[i][j]+" ");
				if(i==0 && arr[i][j].equalsIgnoreCase("B"))
				vip++;
				else if(i>0 && i<3 && arr[i][j].equalsIgnoreCase("B"))
				premium++;
				else if(i==3 && arr[i][j].equalsIgnoreCase("B"))
				regular++;
			}
			System.out.println();
		}
		System.out.println("----SEAT BOOKED DETAIL----");
		System.out.println("--------VIP SEATS--------");
		System.out.println("BOOKED : "+vip+" AVAILABLE : "+(viptotal-vip)+" TOTAL : "+viptotal);
		System.out.println("-----PREMIUM SEATS-----");
		System.out.println("BOOKED : "+premium+" AVAILABLE : "+(premiumtotal-premium)+" TOTAL : "+premiumtotal);
		System.out.println("-----REGULAR SEATS-----");
		System.out.println("BOOKED : "+regular+" AVAILABLE : "+(regulartotal-regular)+" TOTAL : "+regulartotal); 
		sc.close();
	}
}
