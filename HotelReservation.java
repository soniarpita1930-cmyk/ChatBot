
import java.util.Scanner;

public class HotelReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rooms = 3;

        System.out.println("Hotel Reservation System");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if (rooms > 0) {
            rooms--;

            System.out.println("Room Booked Successfully!");
            System.out.println("Guest: " + name);
            System.out.println("Rooms Left: " + rooms);
        } else {
            System.out.println("No Rooms Available");
        }
    }
}
