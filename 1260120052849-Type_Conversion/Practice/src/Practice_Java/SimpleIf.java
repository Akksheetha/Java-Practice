package Practice_Java;

import java.util.Scanner;
public class SimpleIf {
   public static void main(String[] args){
      boolean seatAvailable = true; 
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter the Seat Number : ");
      String SeatNumber = sc.next(); 
      if(seatAvailable){ 
         System.out.println("Your have booked the seat number : "+SeatNumber);
         sc.close();
      }
}
}