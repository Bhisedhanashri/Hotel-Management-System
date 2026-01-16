package oops1;




public class SuiteRoom extends Room {
    private double baseRate;

    public SuiteRoom(int roomNumber, double baseRate) {
        super(roomNumber);
        this.baseRate = baseRate;
    }

    @Override
    public double calculateCost(int days) {
        double total = baseRate * days;
        // 10% discount for suites
        return total * 0.9;
    }

    @Override
    public void displayInfo() {
        System.out.println("Suite Room #" + getRoomNumber() + " | Base Rate: $" + baseRate + " | Booked: " + isBooked());
    }
}

