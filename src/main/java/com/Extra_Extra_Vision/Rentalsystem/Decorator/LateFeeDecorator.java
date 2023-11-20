package main.java.com.Extra_Extra_Vision.Rentalsystem.Decorator;
// concreete class that adds the late fee
public class LateFeeDecorator extends RentalDecorator {
    private double lateFee;

    public LateFeeDecorator(Rental decoratedRental, double lateFee) {
        super(decoratedRental);
        this.lateFee = lateFee;
    }

    @Override
    public double getCost() {
        return super.getCost() + lateFee;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (includes late fee)";
    }
}
