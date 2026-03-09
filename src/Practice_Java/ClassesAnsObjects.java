package Practice_Java;
import java.util.Scanner;
public class ClassesAnsObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int theatre_id = sc.nextInt();
		sc.nextLine();
		String theatre_name = sc.nextLine();
		String theatre_location = sc.nextLine();
		display(theatre_id, theatre_name, theatre_location);
		sc.close();
	}

	private static void display(int theatre_id, String theatre_name, String theatre_location) {
		System.out.println("Theatre ID is "+theatre_id);
		System.out.println("Theatre Name is "+theatre_name);
		System.out.println("Theatre Location is "+theatre_location);
	}

}
