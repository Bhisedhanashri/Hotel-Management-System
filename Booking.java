package oops1;


public class Booking {
    private Customer customer;
    private Room room;
    private int days;

    public Booking(Customer customer, Room room, int days) {
        this.customer = customer;
        this.room = room;
        this.days = days;
    }

    public Customer getCustomer() { return customer; }
    public Room getRoom() { return room; }
    public int getDays() { return days; }

    public double getTotalCost() {
        return room.calculateCost(days);
    }

    public void displayBooking() {
        System.out.println("Customer: " + customer.getName() + " | Room: " + room.getRoomNumber() +
                " | Days: " + days + " | Total Cost: $" + getTotalCost());
    }
}
