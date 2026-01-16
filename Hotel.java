package oops1;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Booking> bookings;

    public Hotel(String name) {
        this.name = name;
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addRoom(Room room) { rooms.add(room); }

    public void viewRooms() {
        System.out.println("\n--- Rooms in " + name + " ---");
        for (Room room : rooms) room.displayInfo();
    }

    public void bookRoom(Customer customer, int roomNumber, int days) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (!room.isBooked()) {
                    room.setBooked(true);
                    Booking booking = new Booking(customer, room, days);
                    bookings.add(booking);
                    System.out.println("Booking successful!");
                    booking.displayBooking();
                    return;
                } else {
                    System.out.println("Room already booked!");
                    return;
                }
            }
        }
        System.out.println("Room not found!");
    }

    public void cancelBooking(int roomNumber) {
        for (Booking b : bookings) {
            if (b.getRoom().getRoomNumber() == roomNumber) {
                b.getRoom().setBooked(false);
                bookings.remove(b);
                System.out.println("Booking canceled for room #" + roomNumber);
                return;
            }
        }
        System.out.println("Booking not found!");
    }

    public void viewBookings() {
        System.out.println("\n--- All Bookings in " + name + " ---");
        for (Booking b : bookings) {
            b.displayBooking();
        }
    }
}
