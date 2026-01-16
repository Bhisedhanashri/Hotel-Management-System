package oops1;



public class DoubleRoom extends Room {
    private double baseRate;

    public DoubleRoom(int roomNumber, double baseRate) {
        super(roomNumber);
        this.baseRate = baseRate;
    }

    @Override
    public double calculateCost(int days) {
        return baseRate * days; // Polymorphism
    }

    @Override
    public void displayInfo() {
        System.out.println("Double Room #" + getRoomNumber() + " | Base Rate: $" + baseRate + " | Booked: " + isBooked());
    }
}
