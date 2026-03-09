//package Java;
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Movie ID : ");
//		int mov_id = sc.nextInt();
//		System.out.println("Enter Movie Name : ");
//		sc.nextLine();
//		String mov_name = sc.nextLine();
//		System.out.println("Enter Movie Description : ");
//		String mov_des = sc.nextLine();
//		System.out.println("Enter Movie Language : ");
//		String mov_lan = sc.next();
//		System.out.println("Enter Movie Genre : ");
//		String mov_genre = sc.next();
//		System.out.println("Enter Movie Release date : ");
//		String mov_rel = sc.next();
//		System.out.println("Enter Movie Seat cost : ");
//		sc.nextLine();
//		float mov_cost = sc.nextFloat();
//		System.out.println("ENTERED MOVIE DETAILS ARE");
//		System.out.println("Movie ID : "+mov_id);
//		System.out.println("Movie Name : "+mov_name);
//		System.out.println("Movie Description : "+mov_des);
//		System.out.println("Movie Language : "+mov_lan);
//		System.out.println("Movie Genre : "+mov_genre);
//		System.out.println("Movie Date : "+mov_rel); 
//		System.out.println("Movie Seat Cost : "+mov_cost);
//	}
//}
package Java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isMoving =true;
		int c_speed = sc.nextInt();
		int currentSpeed = 5;
		if(isMoving) {
			currentSpeed--;
			System.out.println("The current speed is "+currentSpeed);
			System.out.println("Using Scanner current speed is "+c_speed);
		}
		else {
			System.out.println("The object is not moving");
		}
	}
}

