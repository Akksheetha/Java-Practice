package Practice_Java;
import java.util.Scanner;
public class MethodUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Movie Description : ");
		String description = sc.nextLine();
		System.out.println("Enter Movie Duration : ");
		String duration = sc.nextLine();
		System.out.println("Enter Movie Language : ");
		String language = sc.nextLine();
		System.out.println("Enter Movie Release Date : ");
		String release_date = sc.nextLine();
		System.out.println("Enter Movie Country : ");
		String movie_country = sc.nextLine();
		System.out.println("Enter Movie Genre : ");
		String genre = sc.nextLine();
		movie_details(name, description, duration,language, release_date, movie_country, genre);
		sc.close();
	}
	public static void movie_details(String name,String description, String duration, String language, String release_date, String movie_country, String genre) {
		System.out.println("Movie Details : ");
		System.out.println("Movie Name : "+name);
		System.out.println("Movie Description : "+description);
		System.out.println("Movie Duration : "+duration);
		System.out.println("Movie Language : "+language);
		System.out.println("Movie Release Date : "+release_date);
		System.out.println("Movie Country : "+movie_country);
		System.out.println("Movie Genre : "+genre);
	}

}
