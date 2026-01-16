package oops1;


public class SingleRoom extends Room {
    private double baseRate;

    public SingleRoom(int roomNumber, double baseRate) {
        super(roomNumber);
        this.baseRate = baseRate;
    }

    @Override
    public double calculateCost(int days) {
        return baseRate * days; // Polymorphism
    }

    @Override
    public void displayInfo() {
        System.out.println("Single Room #" + getRoomNumber() + " | Base Rate: $" + baseRate + " | Booked: " + isBooked());
    }
}
