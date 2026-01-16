package oops1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel("Grand OOP Hotel");

        // Add rooms
        hotel.addRoom(new SingleRoom(101, 50));
        hotel.addRoom(new DoubleRoom(201, 90));
        hotel.addRoom(new SuiteRoom(301, 200));

        while (true) {
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View All Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    hotel.viewRooms();
                    break;
                case 2:
                    System.out.print("Enter your Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    Customer customer = new Customer(name, email, phone);

                    System.out.print("Enter Room Number to Book: ");
                    int roomNumber = sc.nextInt();
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    hotel.bookRoom(customer, roomNumber, days);
                    break;
                case 3:
                    System.out.print("Enter Room Number to Cancel Booking: ");
                    int cancelRoom = sc.nextInt();
                    hotel.cancelBooking(cancelRoom);
                    break;
                case 4:
                    hotel.viewBookings();
                    break;
                case 5:
                    System.out.println("Exiting system!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
