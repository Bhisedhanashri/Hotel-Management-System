package oops1;

public abstract class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public int getRoomNumber() { return roomNumber; }
    public boolean isBooked() { return isBooked; }
    public void setBooked(boolean booked) { this.isBooked = booked; }

    // Abstract method → Polymorphism
    public abstract double calculateCost(int days);

    public abstract void displayInfo();
}
